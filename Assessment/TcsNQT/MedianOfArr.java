package Assessment.TcsNQT;

import java.util.Arrays;

public class MedianOfArr {
    public static void main(String[] args) {
        System.out.println("Median of the Array");
        int[] nums = {1,2,3,4,5,6,8,9};

        System.out.println("Median is: " + Median(nums));

    }

    public static double Median(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;

        if(n % 2 == 1 ){
            return nums[n/2];
        }
        else{
            int mid1 = nums[(n / 2) - 1];
            int mid2 = nums[n / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
