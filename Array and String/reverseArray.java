import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j=0,n;
        System.out.println("Enter the length of arr: ");
        n= sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the length of arr: ");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        System.out.print("Reverse Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
