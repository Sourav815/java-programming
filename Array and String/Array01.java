import java.util.Scanner;

public class Array01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[],n,i;
        System.out.println("Enter your no of elements: ");
        n = input.nextInt();
        marks = new int[n];
        System.out.println("Enter the elements one by one: ");
        for(i=0;i<marks.length;i++){
            marks[i]= input.nextInt();
        }
        for (int elements : marks) {
            System.out.print(" "+elements);
        }
        System.out.print("\nReversed array is: ");
        for(i=marks.length-1;i>=0;i--){
            System.out.print(" "+marks[i]);
        }
        input.close();
    }
}