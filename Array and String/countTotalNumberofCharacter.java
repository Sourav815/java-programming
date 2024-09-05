import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class countTotalNumberofCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        int i,count=0;
        for( i=0; i<name.length();i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total number of character in the string: "+count);
    }
}
