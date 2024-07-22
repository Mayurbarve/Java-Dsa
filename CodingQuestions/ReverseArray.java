package CodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Arrays");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int arrSize = in.nextInt();
        

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        in.close();

        System.out.println("Orignal Array");
        System.out.println(Arrays.toString(arr));
        
        int[] reverse = new int[arrSize];

        int j = arrSize;
        for (int i = 0; i < arrSize; i++) {    
            reverse[j-1] = arr[i];
            j--;
        }

        System.out.println("Reverse Array");
        System.out.println(Arrays.toString(reverse));
    }
}
