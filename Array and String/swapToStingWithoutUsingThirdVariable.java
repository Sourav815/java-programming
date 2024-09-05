import java.util.Scanner;

public class swapToStingWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1,string2;
        System.out.println("Enter the first string: ");
        string1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        string2 = sc.nextLine();
        string1 = string1.concat(string2);
        string2 = string1.substring(0,string1.length()-string2.length());
        string1 = string1.substring(string2.length());
        System.out.println(string1+" "+string2);
    }
    
}
