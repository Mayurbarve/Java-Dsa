package Array;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Maximum Number in array");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Size of the array: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Number is: " + max);
        
    }
}