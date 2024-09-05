import java.util.Scanner;

public class checkPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, n;
        String name;
        char arr[], arr1[];
        System.out.println("Enter the String: ");
        name = sc.nextLine();
        n = name.length();
        arr = new char[n];
        arr1 = new char[n];

        for (i = 0; i < n; i++) {
            arr[i] = name.charAt(i);
        }
        for (i = n - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        int flag = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] != arr1[i]) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("This is palindrome...");
        } else
            System.out.println("This is not palindrome...");

    }

}
