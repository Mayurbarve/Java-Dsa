package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
        in.close();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
