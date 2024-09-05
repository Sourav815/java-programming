import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jPasswordField {
    public static void main(String[] args) {
        JFrame f = new JFrame("JpasswordField");
        Container c = f.getContentPane();
        f.setSize(400, 400);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Password: "));
        final JPasswordField pf = new JPasswordField(10);
        c.add(pf);
        pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pw = new String(pf.getPassword());
                JOptionPane.showMessageDialog(f, "PassWord is: " + pw);
            }
        });
        f.setVisible(true);

    }
}
