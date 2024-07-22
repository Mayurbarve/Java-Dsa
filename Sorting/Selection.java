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
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the reamining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = maxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // Swap the max element with the last element
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // get max element from the array between start and end element
    private static int maxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
