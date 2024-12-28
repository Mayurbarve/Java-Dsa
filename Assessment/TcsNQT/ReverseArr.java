package Assessment.TcsNQT;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        System.out.println("Reverse the array");

        int[] arr = {4,5,7,2,9,3,0};

        System.out.println("Orignal Array : " + Arrays.toString(arr));

        int[] reverse = new int[arr.length];

        int j = reverse.length;
        for(int i = 0; i < arr.length; i++){
            reverse[j-1] = arr[i];
            j--;
        }

        System.out.println("Reverse String : " + Arrays.toString(reverse));
    }
}
