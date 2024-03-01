package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui1 extends JFrame implements ActionListener {
	
	JLabel j1;
	JLabel j2;
	JTextField f1;
	JTextField f2;
	JButton button1;
//	JButton button2;
	gui1(){
		super("Log In Page");
		setLayout(new FlowLayout(40,50,10));
	j1=new JLabel("Full Name");
	j2=new JLabel("ID Number");
	f1=new JTextField(20);
	f2=new JTextField(20);
	button1=new JButton("Log In ");
//	button2=new JButton("");
	
	add(j1);
	add(f1);
	add(j2);
	add(f2);
	add(button1);
	button1.addActionListener(this);

	
//	add(button2);
	

	}

	public static void main(String[] args) {
gui1 g1=new gui1();
g1.setSize(300,200);
g1.setVisible(true);
g1.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			
			dispose();
		gui g1= new gui();
	    g1.setSize(400,500);
	    g1.setLocationRelativeTo(null);
	    g1. setVisible(true);
	    
		     }
	     }

     }
