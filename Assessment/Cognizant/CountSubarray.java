import java.util.Scanner;

public class CountSubarray {
    static int countSubarray(int N, int target, int[] arr) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int smallest = arr[i];
                int largest = arr[j];
                for (int k = i; k <= j; k++) {
                    if (arr[k] < smallest) {
                        smallest = arr[k];
                    }
                    if (arr[k] > largest) {
                        largest = arr[k];
                    }
                }
                if (smallest + largest <= target) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count Subarray");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Size of array");
        int arrSize = in.nextInt();

        System.out.println("Enter the Target");
        int target = in.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(countSubarray(arrSize, target, arr));
        in.close();
    }
}
