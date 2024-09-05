import java.awt.*;
import java.awt.event.*;

// import org.w3c.dom.events.MouseEvent;

public class adeptertest {
    Label l = new Label();
    adeptertest(){
        Frame f =new Frame();
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.add(l);
        f.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseMoved(MouseEvent e){
                l.setText(e.getX()+", "+e.getY());
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new adeptertest();
    }
}
