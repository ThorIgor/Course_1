package lecture9.notepad;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class NotepadFrame extends JFrame{
	MenuBar menuBar = new MenuBar();
	BufferedReader br;
	BufferedWriter bw;
	private MenuItem menuOpen;
	private MenuItem menuSave;
	private MenuItem menuExit;
	private MenuItem menuAbout;
	private JTextArea theText;
	private NotepadAbout nA;
	
	public NotepadFrame(){
		super("Наш ноутпед");
		initMenu();
		initMainPanel();
		initListeners(this);
	}
	
	private void initMenu(){
		PopupMenu fileMenu = new PopupMenu("Файл");
	    PopupMenu helpMenu = new PopupMenu("Допомога");
	    
	    menuOpen = new MenuItem("Відкрити", new MenuShortcut(KeyEvent.VK_O));
	    menuSave = new MenuItem("Зберегти", new MenuShortcut(KeyEvent.VK_S));
	    menuExit = new MenuItem("Вийти", new MenuShortcut(KeyEvent.VK_X));
	    menuAbout = new MenuItem("Про програму", new MenuShortcut(KeyEvent.VK_A));
	    
	    fileMenu.add(menuOpen);
	    fileMenu.add(menuSave);
	    fileMenu.add(menuExit);
	    
	    helpMenu.add(menuAbout);
	    
	    menuBar.add(fileMenu);
	    menuBar.add(helpMenu);
	    this.setMenuBar(menuBar);
	}
	private void initMainPanel(){
		JPanel panel = new JPanel(new BorderLayout());
	    theText = new JTextArea();
	    panel.add(new JScrollPane(theText), BorderLayout.CENTER);
	    getContentPane().add(panel);
	}
	
	private void initListeners(final JFrame frame){
		this.addWindowListener(new WindowAdapter(){
		      public void windowClosing(WindowEvent e) {
		        System.exit(0);
		      }
		    });
		    
		    menuAbout.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        nA = new NotepadAbout(frame, true);
		        nA.setVisible(true);
		        
		      }
		    });
		    
		    menuExit.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        System.exit(0);
		      }
		    });
		    
		    menuOpen.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        try {
					br = new BufferedReader(new FileReader("text.txt"));
					String s ="";
					String res = "";
					do{
						try {
							s=br.readLine();
						} catch (IOException e) {
							JOptionPane.showMessageDialog(null, "Помилка при читанні", "Помилка", JOptionPane.INFORMATION_MESSAGE);
						}
						 if (s!=null){
							 res+=s+"\n";
						}
					}
					while (s!=null);
					theText.setText(res);
					br.close();
					
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "Файл не знайдено!", "Помилка", JOptionPane.INFORMATION_MESSAGE);
				}catch (IOException e) {
					e.printStackTrace();
				}
		      }
		    });

		    menuSave.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		    	
						try {
							bw = new BufferedWriter(new FileWriter("text.txt"));
							String s = theText.getText();
							bw.write(s);
							bw.close();
						} catch (IOException e1) {
							JOptionPane.showMessageDialog(null, "Помилка при запису", "Помилка", JOptionPane.INFORMATION_MESSAGE);
						}
		      }
			});  
	}
}
