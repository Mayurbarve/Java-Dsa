package Array;

import java.util.Arrays;

/*
Given an array that consist of only 0,1,2. sort the array without using any sorting algorithm 
*/

public class Sort012 {

    static void sortArray(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length -1 ;
        int temp = 0;

        while(mid <= high){
            switch (nums[mid]) {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
            
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("0, 1, 2 Sorting");
        int[] arr = {1,0,2,1,2,2,0,0,1,1,0,0,2,0,2,1};

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
