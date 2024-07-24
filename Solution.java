import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));

        int[] reverse = new int[arrSize];

        int j = arrSize;
        for (int i = 0; i < arrSize; i++) {
            reverse[j -1] = arr[i];
            j--;
        }

        System.out.println(Arrays.toString(reverse));
    }

}

