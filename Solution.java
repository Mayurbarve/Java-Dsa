import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Size");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Unsorted Arrays");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Sorted Arrays");
        System.out.println(Arrays.toString(arr));
        
    }

    static void selectionSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        int smallest = i;
        for (int j = i +1; j < arr.length; j++) {
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

