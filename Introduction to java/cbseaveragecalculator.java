import java.util.Scanner;

public class cbseaveragecalculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Bengali marks: ");
        float B = scan.nextFloat();
        System.out.println("Enter your English marks: ");
        float E = scan.nextFloat();
        System.out.println("Enter your Physics marks: ");
        float P = scan.nextFloat();
        System.out.println("Enter your Mathematics marks: ");
        float M = scan.nextFloat();
        System.out.println("Enter your chemistry marks: ");
        float C = scan.nextFloat();
        float percent;
        percent=((B+E+P+M+C)/5);
        System.out.println("Percentage marks of this student is "+ percent + " %");
        if(percent>=34)
        {
            System.out.println("Congratulations! You have passed.");
        }
        else{
            System.out.println("Sorry! you have not passed. Better Luck next time.Try again");
        }
        scan.close();
    }
}
