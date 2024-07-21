package Array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Smallest Element in the array");

        System.out.print("Enter the Size of the array: ");
        int arrSize = scan.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // scan.nextInt(); manual input
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();

        System.out.println();
        System.out.println("The Smallest Element: " + smallArray(arr));
    }

    //Function for finding Smallest Element
    static int smallArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int res = arr[i];
            if (arr[i] < res) {
                res = arr[i];
            }
            temp = res;
        }
        return temp;
    }
}
