class Solution {
    public static int peakIndexInMountainArray(int[] arr) {
        int peakIndex = 0;
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > value){
                value = arr[i];
                peakIndex = i;
            }
        }

        return peakIndex;
    }

    
    public static int findMin(int[] nums) {
        // Initialize val to the first element of the array
        int val = nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            // Update val if a smaller value is found
            if (nums[i] < val) {
                val = nums[i];
            }
        }
    
        return val;
    }
    

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};

        // System.out.println(peakIndexInMountainArray(arr));
        System.out.println(findMin(arr));
        
    }
}