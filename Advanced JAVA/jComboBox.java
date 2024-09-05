import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class jComboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table");
        Container c = f.getContentPane();
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        JLabel l = new JLabel();
        String[] colors = {"Red", "Green","Blue"};
        final JComboBox cb = new JComboBox<>(colors);
        cb.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){l.setText("Selected color: "+cb.getSelectedItem());}

        });
        c.add(l);
        c.add(cb);
        f.setVisible(true);
    }
}
