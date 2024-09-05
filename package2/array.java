package pack2;

import java.util.Scanner;

public class array {
    public void arrayCreate(int n, int arry[]) {
        Scanner sc = new Scanner(System.in);
        // arry = new int[n];
        System.out.println("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }
    }

    public void display(int n, int arry[]) {

        for (int i = 0; i < n; i++) {
            System.out.println("Item [" + i + "] = " + arry[i]);
        }
    }

    public void ItemSearch(int n, int arry[], int val) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arry[i] == val) {
                System.out.println("Item founded");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Item NOt founded");
        }
    }
}
