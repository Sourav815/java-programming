import java.util.Scanner;

public class toFindDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        char str[] = name.toCharArray();
        System.out.print("Duplicate characters are: ");
        for(int i=0; i<name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(str[i]==str[j]){
                    System.out.print(str[i]+" ");
                }
            }
        }
    }
    
}
