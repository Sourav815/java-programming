import java.util.Scanner;

public class operationOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[], arr2[], arr3[], arr4[], arr5[], arr6[], n, i;
        System.out.println("Enter the length of arr1 and arr2: ");
        n = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];
        arr3 = new int[n];
        arr4 = new int[n];
        arr5 = new int[n];
        arr6 = new int[n];

        System.out.println("Enter the elements of First array: ");
        for (i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for (i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            arr4[i] = arr1[i] + arr2[i];
        }
        for (i = 0; i < n; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        for (i = 0; i < n; i++) {
            arr5[i] = arr1[i] * arr2[i];
        }
        for (i = 0; i < n; i++) {
            arr6[i] = arr1[i] / arr2[i];
        }
        System.out.print("After Adding two Arrays: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.print("\n");
        System.out.print("After substraction two Arrays: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.print("\n");
        System.out.print("After multiplication of two Arrays: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.print("\n");
        System.out.print("After Division two Arrays: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr6[i] + " ");
        }

    }

}
