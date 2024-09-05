import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingTest{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Container c = f.getContentPane();
        f.setSize(500,500);
        c.setLayout(new FlowLayout());
        JLabel list = new JLabel();
        
        String[] car = {"BMW", "Marcedes","Ferari","Audi"};
        JComboBox cb = new JComboBox<>(car);
        // cb.setBounds(100,50,50,50);
        
        cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                list.setText("you have selected "+cb.getSelectedItem()+" car");
            }
        });
        c.add(list);
        c.add(cb);
        f.setVisible(true);
    }
}