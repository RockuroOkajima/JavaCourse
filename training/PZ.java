import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    JLabel RL;
    JLabel rL;  
    JLabel hL;   
    JLabel vL;

    JTextField RTF;
    JTextField rTF;
    JTextField hTF;
    JTextField vTF;

    JButton CalculateB;
    JButton ExitB;

    CalculateButtonHandler cbHandler;
    ExitButtonHandler ebHandler;

    public Main() 

    {
        setTitle("Обьем шарового слоя");

        RL = new JLabel("Введите длину верхнего радиуса =   ", JLabel.RIGHT);
        rL = new JLabel ("Введите длину нижнего радиуса =  ", JLabel.RIGHT);
        hL = new JLabel ("Введите высоту =  ", JLabel.RIGHT);
        vL = new JLabel ("Обьем шароого слоя равен", JLabel.RIGHT);

        RTF = new JTextField(10);
        rTF = new JTextField (10);
        hTF = new JTextField (10);
        vTF = new JTextField (10);

        CalculateB = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        CalculateB.addActionListener(cbHandler);

        ExitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        ExitB.addActionListener(ebHandler);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5,2));

        pane.add(RL);
        pane.add(RTF);
        pane.add(rL);
        pane.add(rTF);
        pane.add(hL);
        pane.add(hTF);
        pane.add(vL);
        pane.add(vTF);
       
        pane.add(CalculateB);
        pane.add(ExitB);

        setSize(400,300);
        setVisible(true);
    }

    public class CalculateButtonHandler implements ActionListener {

        public void actionPerformed (ActionEvent e)
            {
        	double RR, rr, height ,volume;
        	RR = Double.parseDouble(RTF.getText());
        	rr = Double.parseDouble(rTF.getText());
        	height =Double.parseDouble(hTF.getText());
        	volume =(0.5 * Math.PI * height *(Math.pow(RR,2) + Math.pow(rr,2) + (0.33*Math.pow(height,2))));
        	
        

        	vTF.setText("" + volume);
        
            }
    }

    public class ExitButtonHandler implements ActionListener {

        public void actionPerformed (ActionEvent e)
            {
            System.exit(0);
            }
        }

    public static void main(String[] args) {

    	 Main volumObject = new Main();
    	    volumObject.setVisible(true);

    }

}
