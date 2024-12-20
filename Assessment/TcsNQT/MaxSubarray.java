package Assessment.TcsNQT;

public class MaxSubarray {
    public static int subarray(int[] nums){
        int maxFind = nums[0];
        int maxSum = nums[0];

        for(int arr = 1; arr<nums.length; arr++){
            maxFind = Math.max(nums[arr], maxFind + nums[arr]);

            maxSum = Math.max(maxFind, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Maximum Product Subarray");

        int[] arr = {2, 3, -2, 4};
        System.out.println(subarray(arr));
    }
}
