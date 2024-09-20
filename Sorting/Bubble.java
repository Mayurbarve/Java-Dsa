package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bubble Sort");

        System.out.println("Enter the Size of array");
        int arrSize = scan.nextInt();
        scan.close();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arr));

        // System.out.println("Sorted Array: ");
        // bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(bubbleSort(arr));
    }

    static int bubbleSort(int[] arr){
        int count = 0;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return count;
    }
}