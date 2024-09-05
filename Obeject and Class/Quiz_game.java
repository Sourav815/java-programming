import java.util.Random;
import java.util.Scanner;

public class Quiz_game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your choice just like (0 for Rock, 1 for paper, 2 for scissor): ");
        int a= scan.nextInt();
        Random rn = new Random();
        int computerinput = rn.nextInt(3);
        if(a==computerinput){
            System.out.println("Match is draw.");
        }
        else if((a==0 && computerinput == 1) || (a==1 && computerinput == 2)||(a==2 && computerinput == 0))
        {
            System.out.println("Computer win!");
        }
        else if(a>2){
            System.out.println("Error! please Enter correct input");
        }
        else{
            System.out.println("You win!");
        }
        // System.out.println("x");
        if(computerinput == 0){
            System.out.println("Computer choose: Rock");
        }
        else if(computerinput == 1){
            System.out.println("Computer choose: Paper");
        }
        else if(computerinput == 2){
            System.out.println("Computer choose: Scissor");
        }
        scan.close();
    }
}
