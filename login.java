import javax.swing.*;
import java.awt.*;

class gui{
  public static void main(String args[]){
    JFrame frame = new JFrame("test frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
    panel.setBackground(Color.black);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbc.insets = new Insets(0, 15, 0, 0);
    JPasswordField passw = new JPasswordField(10);
    JLabel label = new JLabel("LOGIN");
    label.setForeground(Color.RED);
    JLabel label2 = new JLabel("PASSWORD");
    label2.setForeground(Color.RED);
    JTextField login = new JTextField(10);
    JButton enter = new JButton("ENTER");

     
    panel.add(label);
    panel.add(login,gbc);
    panel.add(label2);
    panel.add(passw,gbc);
    panel.add(enter);
    frame.getContentPane().add(panel);
    frame.setVisible(true);
  }
}
