import java.awt.*;
import javax.swing.*;
// import javax.swing.JTextField;
public class JTextField{
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextField");
        Container c = f.getContentPane();
        f.setSize(400,400);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("What is your name: "));
        JTextField tf = new JTextField();
        c.add(tf);
        f.setVisible(true);

    }
}