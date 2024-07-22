import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sort array");

        //Get size of the array
        System.out.print("Enter the array size: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        //get the array element using randaom insted of getting through the user
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100); //in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        System.out.println("Element on index: " + arrayorder(arr, target));
        in.close();

    }
    
    static int arrayorder(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
}
