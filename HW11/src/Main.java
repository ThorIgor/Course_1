import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

class ToSmallException extends Exception
{
	public ToSmallException() {
		super("File is to small");
	}
}

public class Main extends JFrame{
	JPanel topPanel, mainPanel = null;
	JButton searchButton, openButton, allButton;
	JTextField searchField;
	JTextArea mainArea;
	JScrollPane mainPane;
	
	Dictionary dictionary;
	
	public Main()
	{
		super();
		this.setName("Dictionary");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel(new GridLayout(0, 4));
		searchField = new JTextField();
		searchButton = new JButton("Search");
		openButton = new JButton("Open");
		allButton = new JButton("Print all");
		
		topPanel.add(allButton);
		topPanel.add(searchField);
		topPanel.add(searchButton);
		topPanel.add(openButton);
		
		initMainArea();
		
		this.add(topPanel, BorderLayout.NORTH);
		
		dictionary = new Dictionary();
		
		allButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainArea.setText(dictionary.toString());
			}
		});
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sw = searchField.getText();
				HashMap<String, Word> words = dictionary.getWords();
				if(!words.containsKey(sw))
					mainArea.setText("Nothing");
				else
				{
					String text = "Find:";
					text+="\n" + words.get(sw);
					mainArea.setText(text);
				}
				
			}
		});
		
		openButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//try {
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					File f = fc.getSelectedFile();
					//if(f.length() < 150*1024)
						//throw new ToSmallException();
					dictionary.addFile(fc.getSelectedFile());
				}
				//}catch(ToSmallException tse) {
					//JOptionPane.showMessageDialog(null, tse.getMessage());
				//}
			}
		});
		
	}
	
	private void initMainArea()
	{
		if(mainPanel != null)
			this.remove(mainPanel);
		mainPanel = new JPanel(new BorderLayout());
		mainArea = new JTextArea();
		mainPane = new JScrollPane(mainArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		mainPanel.add(mainPane, BorderLayout.CENTER);
		mainArea.setEditable(false);
		
		this.add(mainPanel);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.setVisible(true);
	}
}
