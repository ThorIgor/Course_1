import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MathGame extends JFrame{
	private JPanel startPanel;
	private JSpinner numberOfEx;
	private JSlider maxNumber;
	private JLabel numberLabel;
	private JButton startButton;
	private JPanel mainPanel = null;
	private JSpinner answerFields[];
	private JButton verifyButton;
	
	private int answers[];
	
	public MathGame()
	{
		super();
		this.setName("Math game");
		this.setSize(800, 500);
		
		startPanel = new JPanel(new FlowLayout());
		numberOfEx = new JSpinner();
		numberOfEx.setValue(1);
		maxNumber = new JSlider(1, 100);
		numberLabel = new JLabel("Max:" + maxNumber.getValue());
		startButton = new JButton("Start");
		
		startPanel.add(new JLabel("Examples:"));
		startPanel.add(numberOfEx);
		startPanel.add(numberLabel);
		startPanel.add(maxNumber);
		startPanel.add(startButton);
		this.add(startPanel, BorderLayout.NORTH);
		
		initMainPanel();
		
		numberOfEx.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if((int)numberOfEx.getValue() < 1)
					numberOfEx.setValue(1);
			}
		});
		maxNumber.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				numberLabel.setText("Max:" + maxNumber.getValue());
				
			}
		});
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				initMainPanel();
				int ex = (int)numberOfEx.getValue();
				int max = maxNumber.getValue();
				answerFields = new JSpinner[ex];
				answers = new int[ex];
				for(int i = 0; i < ex; i++)
				{
					if((int)(Math.random()*1000)%2 == 0)
					{
						int a = (int)(Math.random()*1000)%max;
						int b = (int)(Math.random()*1000)%(max-a);
						mainPanel.add(new JLabel(a + "+" + b + "="));
						answerFields[i] = new JSpinner();
						mainPanel.add(answerFields[i]);
						answers[i] = a+b;
					}
					else
					{
						int a = (int)(Math.random()*1000)%max;
						int b;
						if(a == 0)
							b = 0;
						else
							b = (int)(Math.random()*1000)%a;
						mainPanel.add(new JLabel(a + "-" + b + "="));
						answerFields[i] = new JSpinner();
						mainPanel.add(answerFields[i]);
						answers[i] = a-b;
					}
					initVerifyButton();
				}
			}
		});	
	}
	
	private void initMainPanel()
	{
		if(mainPanel != null)
			this.remove(mainPanel);
		mainPanel = new JPanel(new GridLayout(0, 2));
		Border border = BorderFactory.createTitledBorder("Examples");
		mainPanel.setBorder(border);
		this.add(mainPanel, BorderLayout.CENTER);
	}
	
	private void initVerifyButton()
	{
		verifyButton = new JButton("Verify");
		this.add(verifyButton, BorderLayout.SOUTH);
		verifyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean corect = true;
				int errors = 0;
				for(int i = 0; i < answers.length; i++)
				{
					if(answers[i] != (int)answerFields[i].getValue())
					{
						corect = false;
						errors++;
					}
				}
				if(corect)
					JOptionPane.showMessageDialog(mainPanel, "Corect");
				else
					JOptionPane.showMessageDialog(mainPanel, "Uncorect. Errors: " + errors);
			}
		});
	}
	
	public static void main(String[] args) {
		MathGame mg = new MathGame();
		mg.setVisible(true);

	}

}
