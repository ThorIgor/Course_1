package lecture9.notepad;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NotepadAbout extends JDialog{
	JButton ok;
	
	public NotepadAbout(Frame owner, boolean modal){
		super(owner, modal);
		
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        Dimension dialogSize = new Dimension(100, 100);
        setSize(dialogSize);
        add(new JLabel("Це наше перше діалогове вікно"));
        ok = new JButton("OK");

        pack();
        
	}
}
