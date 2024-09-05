import java.awt.*;
// import java.awt.event.*;
import javax.swing.*;

public class progressBar {
    public static void main(String[] args) throws Exception{
        JFrame f = new JFrame();
        Container c = f.getContentPane();
        f.setSize(500,500);
        c.setLayout(new FlowLayout());
        JProgressBar p = new JProgressBar(0,100);
        p.setStringPainted(true);
        for(int i=0;i<=50;i++){
            p.setValue(i);
            Thread.sleep(100);
        }
        c.add(p);

        f.setVisible(true);

    }
}
