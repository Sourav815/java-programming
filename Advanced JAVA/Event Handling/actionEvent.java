import java.awt.*;
import java.awt.event.*;

class actionEvent extends Frame implements ActionListener {

    TextField tf;

    actionEvent() {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(tf);
        add(b);
        setSize(300, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("WelCome");
    }

    public static void main(String[] args) {
        new actionEvent();
    }
}