import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;




public class Main  extends JPanel  {
	
		public Main(){
			JPanel centerPanel = new JPanel(new GridLayout(2, 2));
      
			JTextField Tess = new JTextField();
			Tess.setBackground(new Color(105,105,105));
			Tess.setBorder(new LineBorder(new Color(0,0,0),1));
			Tess.setBounds(100,100, 30,30);
      
			JPasswordField Ress = new JPasswordField();
			Ress.setBackground(new Color(105,105,105));
			Ress.setBorder(new LineBorder(new Color(0,0,0),1));
      
			JLabel log = new JLabel("LOGIN");
			log.setForeground(Color.red);
			log.setFont(new Font("Serif", Font.PLAIN, 25));
      
			JLabel pas = new JLabel("PASSWORD");
			pas.setForeground(Color.red);
			pas.setFont(new Font("Serif", Font.PLAIN, 25));
      
			JButton button = new JButton("LOG-IN");
			
			
			centerPanel.add(log);
			centerPanel.add(Tess);
			centerPanel.add(pas);
			centerPanel.add(Ress);
			centerPanel.add(button);
			centerPanel.setBackground(Color.BLACK);
			
			int gap = 5;
		      setLayout(new BorderLayout(gap, gap));
		      setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		      add(centerPanel, BorderLayout.CENTER);
		      add(button, BorderLayout.PAGE_END);
		      
		   }
		private static void createAndShowGui() {
		      JFrame frame = new JFrame("Access");
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.getContentPane().add(new Main());
		      frame.getContentPane().setBackground(Color.BLACK);
		      frame.pack();
		      frame.setLocationRelativeTo(null);
		      frame.setVisible(true);
		      frame.setSize(600,200);
		   }

		   public static void main(String[] args) {
		      SwingUtilities.invokeLater(new Runnable() {
		         public void run() {
		            createAndShowGui();
		         }
		      });

	
	}
	
 	
}	  
	
	
