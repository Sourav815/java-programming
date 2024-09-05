import java.awt.*;

public class test {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.add(new Checkbox("WiFi",null,true));
        f.add(new Checkbox("5GHz"));
        f.add(new Checkbox("2.5GHz"));
        f.setVisible(true);
    }
}
