import java.util.Scanner;

public class takeInputCountLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int count=0;
        System.out.println("Enter you Bio in Short: ");
        name = sc.nextLine();
        for(int i=0; i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(name);
        System.out.println("Total Length of this shorts: "+count);
    }
    
}
