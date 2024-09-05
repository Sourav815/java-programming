import java.awt.*;

public class emptyFrame{
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        f.setSize(500,500);
        f.setTitle("New Title");
        f.setLayout(new GridLayout());
        Label l = new Label("MY name is sourav Bhunia");
        Button b= new Button("Submit");
        f.add(l);
        f.add(b);
        f.setVisible(true);
    }
}