import java.util.Scanner;

public class arrayAddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,sum= 0;
        System.out.println("Enter the number of input: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array input: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all array elements: "+sum);
    }
    
}
