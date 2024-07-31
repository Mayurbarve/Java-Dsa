package Searching.BinarySearch;

import java.util.Scanner;

public class DisOrderSea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("| Binary Search |");
        System.out.println("Select an Operation: \n1) Ascending order \n2) Descending order");
        int choice = scan.nextInt();

        System.out.print("Enter the Size of array: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("Enter the Array :");
        for (int k = 0; k < arrSize; k++) {
            arr[k] = scan.nextInt(); // ascending order
            // arr[k]= (int)(Math.random()*100);
        }

        switch (choice) {
            case 1:
                System.out.println("Array of Ascending order");
                for (int i = 0; i < arrSize; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.print("Enter the Target element: ");
                int target = scan.nextInt();
                System.out.println("Element on index: " + BinSearchArr(arr, target));
                break;
            case 2:
                System.out.println("Array of Descending order");
                for (int i = 0; i < arrSize; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.print("Enter the Target element: ");
                int target1 = scan.nextInt();
                System.out.println("Element on index: " + BinSearchArr(arr, target1));
                break;
            default:
                System.out.println("Enterd invalid choice");
                break;
        }
        scan.close();
    }

    static int BinSearchArr(int[] arr, int target) {
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
