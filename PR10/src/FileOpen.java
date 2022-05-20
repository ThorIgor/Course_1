import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import javax.swing.plaf.FileChooserUI;

public class FileOpen extends JFrame{
	private JButton openFile;
	private JTextArea mainText;
	
	private BufferedReader br;
	
	public FileOpen()
	{
		super();
		this.setName("File opener");
		this.setSize(400, 300);
		
		openFile = new JButton("Open");
		this.add(openFile, BorderLayout.NORTH);
		
		mainText = new JTextArea();
		this.add(mainText, BorderLayout.CENTER);
		
		openFile.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        try {
		        	JFileChooser fc = new JFileChooser();
		        	int returnVal = fc.showOpenDialog(null);
					br = new BufferedReader(new FileReader( fc.getSelectedFile()));
					String s ="";
					String res = "";
					do{
						try {
							s=br.readLine();
						} catch (IOException e) {
							JOptionPane.showMessageDialog(null, "ERROR", "Error", JOptionPane.ERROR_MESSAGE);
						}
						 if (s!=null){
							 res+=s+"\n";
						}
					}
					while (s!=null);
					mainText.setText(res);
					br.close();
					
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
				}catch (IOException e) {
					e.printStackTrace();
				}
		      }
		});
	}

	public static void main(String[] args) {
		FileOpen fo = new FileOpen();
		fo.setVisible(true);
	}

}
