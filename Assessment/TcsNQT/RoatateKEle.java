package Assessment.TcsNQT;

import java.util.Scanner;

public class RoatateKEle {
    public static void main(String[] args) {
        System.out.println("Rotate array by K element");

        Scanner in = new Scanner(System.in);
        int[] arr = {5,6,8,4,3,9,2};

        System.out.println("Enter K Value");
        int k = in.nextInt();
        in.close();

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end++;
        }
    }
}
