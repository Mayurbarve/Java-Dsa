package Array;

import java.util.Arrays;

public class MoveNagative {
    static void moveNagative(int[] arr){
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            if(arr[left] < 0){
                left++;
            }
            else if(arr[right] >= 0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Move Negative Number One Side");

        int[] arr = {-1, 0, 3, -4,-8, -7, 4};

        moveNagative(arr);
        System.out.println(Arrays.toString(arr));
    }
}
