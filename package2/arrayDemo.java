import java.util.Scanner;

import pack2.array;

public class arrayDemo {
    public static void main(String[] args) {
        array obj = new array();
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to be searched: ");
        value = sc.nextInt();
        int arr[] = new int[5];
        obj.arrayCreate(5, arr);
        obj.display(5, arr);
        obj.ItemSearch(5, arr, value);
    }
}
