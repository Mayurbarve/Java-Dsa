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
        System.out.println("Largest Sum of Subarray: " + maxSubArraySum(arr));
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

    //Second Method
    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int maxFind = arr[0];

        for(int nums = 1; nums < arr.length; nums++){
            maxFind= Math.max(arr[nums], maxFind + arr[nums]);

            maxSum = Math.max(maxSum, maxFind);
        }

        return maxSum;


    }
}
