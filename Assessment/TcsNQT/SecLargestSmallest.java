package Assessment.TcsNQT;

import java.util.Arrays;

public class SecLargestSmallest {
    public static void main(String[] args) {
        System.out.println("Second largest and second smallest");

        int[] arr = {4,6,8,3,1,8,9,2,10};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Second smallest: " + arr[1]);
        System.out.println("Second Largest: " + arr[arr.length-2]);
    }
}
