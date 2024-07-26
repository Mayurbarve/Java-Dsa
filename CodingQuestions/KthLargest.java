package CodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        System.out.println("Find the kth Largest Element");
        Scanner in = new Scanner(System.in);

        int[] arr = {3,2,1,5,4,6,8,9,0};
        System.out.println(Arrays.toString(arr));

        sortArray(arr);
        System.out.print("Enter the Kth Element: ");
        int kth = in.nextInt();
        in.close();

        int kthLargest = arr.length - (kth -1);
        System.out.print("Kth Largets Element is: "+ kthLargest);
    }

    static void sortArray(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length -1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length -i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
