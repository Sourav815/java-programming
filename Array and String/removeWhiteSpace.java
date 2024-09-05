import java.util.*;

public class removeWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        StringBuffer newName = new StringBuffer();
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                newName.append(name.charAt(i));
            }
        }
        System.out.println(newName);
    }
}
