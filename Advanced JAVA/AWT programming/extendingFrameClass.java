import java.awt.*;

class extendingFrameClass extends Frame {
    extendingFrameClass() {
        Button b = new Button("Submit");
       b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        extendingFrameClass D = new extendingFrameClass();
    }
}