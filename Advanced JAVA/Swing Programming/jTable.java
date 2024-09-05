import java.awt.*;
import javax.swing.*;

public class jTable {
    public static void main(String args[]){
        JFrame f = new JFrame("Table");
        Container c = f.getContentPane();
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        JTable jt = new JTable(3,2);
        for(int i=0;i<3;i++)
        {
            jt.setValueAt(i,i, 0);
            jt.setValueAt(i*i,i, 1);
        }
        c.add(jt);
        f.setVisible(true);
    }
}
