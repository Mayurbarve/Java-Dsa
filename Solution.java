import java.util.Scanner;

public class Solution {
    static int countSubarray(int n, int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j = i; j< n; j++){
                int smallest = arr[i];
                int largest = arr[j];
                for(int k = i; k <= j; k++){
                    if(arr[k] < smallest){
                        smallest = arr[k];
                    }
                    if(arr[k] > largest){
                        largest = arr[k];
                    }
                }
                if(smallest + largest < target){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arrSize");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target");
        int target = sc.nextInt();

        System.out.println(countSubarray(arrSize, arr, target));
        sc.close();
    }
}
