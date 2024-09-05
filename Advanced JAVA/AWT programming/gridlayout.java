import java.awt.*;
public class gridlayout{
    public static void main(String[] args) {
        Frame f = new Frame("Login Page");
        f.setLayout(new GridLayout(3,3,2,2));
        f.setSize(300,300);
        f.add(new Label("Username:"));
        f.add(new Label("Password:"));
        f.add(new TextField());
        TextField pass = new TextField();
        pass.setEchoChar('*');
        f.add(pass);
        f.add(new Button("Submit"));
        f.add(new Button("Cancel"));
        f.setVisible(true);
    }
}