import java.util.Scanner;

public class countVowelandConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int v = 0, c = 0;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='A'||name.charAt(i)=='e'||name.charAt(i)=='E'||name.charAt(i)=='i'||name.charAt(i)=='I'||name.charAt(i)=='o'||name.charAt(i)=='O'||name.charAt(i)=='u'||name.charAt(i)=='U')
                v++;
            else
                c++;
        }
        System.out.println("Vowel: "+v+" Consonent: "+c);
    }

}
