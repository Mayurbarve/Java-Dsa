package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the size of array");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

         System.out.println("Unsorted Array");
         System.out.println(Arrays.toString(arr));

         insertionSort(arr);
         System.out.println(Arrays.toString(arr));
         sc.close();
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && current < arr[j]){  
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
            
        }
    }
}
