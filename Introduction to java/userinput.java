import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("This is java programming!");
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter integer1 and float1 value respectively:~ ");
        // int a = scan.nextInt();
        // float c= scan.nextFloat();
        // System.out.println("Enter integer2 and float2 value respectively:~ ");
        // int b = scan.nextInt();
        // float d= scan.nextFloat();
        // int sum1 = a + b;
        // float sum2 = c + d;
        // System.out.println("The sum of these two integer number Number is:~ " + sum1);
        // System.out.println("The sum of these two floating number Number is:~ " + sum2);

        boolean b=scan.hasNextInt(); // It's check that entered value is int or float or char or string etc
        System.out.println(b);

        // for string output
        // String s = scan.next(); // It will only print before space.
        // System.out.println(s);
        String str = scan.nextLine(); // It will print whole sentence.
        System.out.println(str);
        scan.close();
    }
}
