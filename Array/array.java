package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        System.out.println("1D Array");

        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
        }

        for(int i= 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int[] newArr = new int[10];
        int i = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            newArr[i] = arr[j];
            i++;
        }

        System.out.println(Arrays.toString(newArr));
    }
    
}