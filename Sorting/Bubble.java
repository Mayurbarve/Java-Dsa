package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bubble Sort");

        System.out.print("Enter the Array Size: ");
        int arrSize = scan.nextInt();

        int[] arr = new int[arrSize];
        //System.out.println("Enter the Array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100); //scan.nextInt();  for manul array element
        }
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("sorted Arrays");
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
    
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}