package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        System.out.println("Largest sum Contiguos Subarray");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Size of Arrays: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        System.out.println(Arrays.toString(arr));

        
        System.out.println("Largest Sum of Subarray: " + maxSubarray(arr));
    }

    static int maxSubarray(int[] arr){
        int maxSum = 0; 
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
             currSum += arr[i];
             if(currSum > maxSum){
                maxSum = currSum;
             }
             if(currSum < 0){
                currSum = 0;
             }
        }

        return maxSum;
    }
}
