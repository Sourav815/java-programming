import java.awt.*;
import java.awt.event.*;

public class actionEventCopy extends Frame {

    TextField tf1, tf2;

    actionEventCopy() {
        tf1 = new TextField();
        tf2 = new TextField();
        Button b = new Button("Copy");
        setSize(400, 400);
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf1.getText());
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new actionEventCopy();
    }
}
