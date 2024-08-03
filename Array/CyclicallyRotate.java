package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotate {
    public static void main(String[] args) {
        System.out.println("Cyclically Rotate an array by one");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int arrSize = sc.nextInt();
        sc.close();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Orignal Arrray: " + Arrays.toString(arr));

        int lastEle = arr[arr.length -1]; 

        for (int i = arr.length -1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastEle;

        System.out.println("Cyclically Array: " + Arrays.toString(arr));
    }
}
