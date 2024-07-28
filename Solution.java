import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    static void sortArray(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,8,4,0,10,12,20,50};

        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the Kth Smallest Emelemt: ");
        int kth = in.nextInt();
        in.close();

        for (int i = 0; i < arr.length; i++) {
            if(i == (kth -1)){
                System.out.println("Kth Smallest: " + arr[i]);
            }
        }

        
        


    }
}