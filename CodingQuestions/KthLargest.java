package CodingQuestions;
import java.util.Arrays;
import java.util.Scanner;

/*

 */
public class KthLargest {

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

    static int LargestKth(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,8,4,0,10,12,20,50};

        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the Kth Smallest Emelemt: ");
        int kth = in.nextInt();
        

        for (int i = 0; i < arr.length; i++) {
            if(i == (kth -1)){
                System.out.println("Kth Smallest: " + arr[i]);
            }
        }

        System.out.print("Enter the Kth Largest Element: ");
        int kthL = in.nextInt();
        in.close();
        System.out.println("kth Largest: " + LargestKth(arr, kthL));

    }
}