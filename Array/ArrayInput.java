package Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        System.out.println("Arrat Input");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter the Array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enterd array");
        System.out.print("[ ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("]");
        in.close();
    }
    
}