import java.awt.*;

public class flowLayout2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Panel p = new Panel();
        f.setSize(200,120);
        p.setLayout(new GridLayout(3,2));
        p.add(new Label("username"));
        p.add(new TextField());
        p.add(new Label("Password"));
        TextField pass =new TextField();
        pass.setEchoChar('*');
        p.add(pass);
        p.add(new Button("Submit"));
        p.add(new Button("Cancel"));
        f.add(p);
        f.setVisible(true);

    }
}
