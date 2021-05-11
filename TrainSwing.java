import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main  {
	
		

	public static void main(String args[]){
		new Main();
		JPanel pane = new JPanel();
		JFrame f = new JFrame();
		JLabel  Login;
		JLabel  Pass;
		JTextField logtex;
		JPasswordField passtex;
		
		
		 
		
		
		f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(400, 400);
	    f.getContentPane().setBackground(Color.BLACK);
	     
	      
		logtex = new JTextField();
		logtex.setBackground(new Color(105,105,105));
		logtex.setBorder(new LineBorder(new Color(0,0,0),2));
		 
		passtex = new JPasswordField();
		passtex.setBackground(new Color(105,105,105));
		passtex.setBorder(new LineBorder(new Color(0,0,0),2));
		 
		Login = new JLabel("LOGIN");
		Login.setForeground(Color.red);
		Login.setFont(new Font("Serif", Font.PLAIN, 25));
		Pass = new JLabel("PASSWORD");
		Pass.setForeground(Color.red);
		Pass.setFont(new Font("Serif", Font.PLAIN, 25));
		 
		
		logtex.setBounds(865,300, 150,30);
		passtex.setBounds(865,400,150,30);
		Login.setBounds(665,300, 200,30);
		Pass.setBounds(665,400,200,30);
		
		
		f.add(Login);
		f.add(logtex);
		f.add(Pass);
		f.add(passtex);
		
		
		 
		 
		
		JTextField LoginT = new JTextField(10);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
 	
}	  
	
	
