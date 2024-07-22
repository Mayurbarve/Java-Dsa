package CodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        System.out.println("Maximumm Element in array");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }

        System.out.println("array");
        System.out.println(Arrays.toString(arr));
        System.out.print("Max Elemnt is: " + getMaxElement(arr));
        in.close();
    }

    static int getMaxElement(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
