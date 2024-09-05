import java.util.Scanner;

public class additionOfTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][], arr2[][], m, n, j, i;
        System.out.println("Enter the row(n) and column(m) of arr1 and arr2: ");
        n = sc.nextInt();
        m = sc.nextInt();
        arr1=new int[n][m];
        arr2 = new int[n][m];
        System.out.println("Enter the elements of array1 row by column: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of array1 row by column: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j]+=arr2[i][j];
            }
        }
        System.out.println("After Adding two 2D array: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
