import java.util.Scanner;

public class MaxSubarray {
    static int FindMaxSubarray(int[] arr){
        int maxFind = arr[0];
        int maxSum = arr[0];

        for(int num = 1; num < arr.length; num++){
            maxFind = Math.max(arr[num], maxFind + arr[num]);

            maxSum = Math.max(maxSum, maxFind);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Max Sub Array");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Size of array");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the array emement");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Max Subarray is: "+ FindMaxSubarray(arr));
        in.close();
    }
}
