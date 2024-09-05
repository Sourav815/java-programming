import java.awt.*;

public class flowLayout {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout");
        f.setSize(300,200);
        f.setLayout(new FlowLayout());
        f.add(new Button("OK"));
        f.add(new Button("Exit"));
        f.add(new Button("Clik me"));
        f.add(new Button("Submit"));
        f.add(new Button("OK"));
        f.add(new Button("Exit"));
        f.add(new Button("Clik me"));
        f.add(new Button("Submit"));
        f.setVisible(true);

    }
}
