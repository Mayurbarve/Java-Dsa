package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sort array");

        // Get size of the array
        System.out.print("Enter the array size: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        // get the array element using randaom insted of getting through the user
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // in.nextInt();
        }

        // Print the unsorted array
        System.out.println("Unsort array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();

        System.out.println();
        
        System.out.println("Second Smallest Element are: " + SmallestEle(arr, arrSize));
        System.out.println("Second Smallest Element are: " + getSecondSmallest(arr, arrSize));
    }

    //First Method
    static int SmallestEle(int[] arr, int total){
        //Sort the array and get second smallest
        int temp = 0;
        for(int i =  0; i< total; i++){
            for(int j = i+1; j < total; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    //Second Method
    static int getSecondSmallest(int[] a, int total) {
        Arrays.sort(a);
        return a[1];
    }
    
}