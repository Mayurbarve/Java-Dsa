package Array.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("| Binary Search |");
        System.out.print("Enter the Size of array: ");
        int arrSize = scan.nextInt();

        int[] arr = new int[arrSize];

        for(int k = 0; k < arrSize; k++){
            arr[k] = (int)(Math.random()*100); // scan.nextInt();
            
        }
        System.out.println("Unsorted Array");
        for(int i = 0; i < arrSize; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println();
        System.out.println("Sorted Array");
        for(int i = 0; i < arrSize; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the Target element: ");
        int target = scan.nextInt();
        scan.close(); 
        System.out.println("Element on index: " + BinSearchArr(arr, target));
    }



    static int BinSearchArr(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            //find middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                //answer
                return mid;
            }
            
        }
        return -1;
    }
}
