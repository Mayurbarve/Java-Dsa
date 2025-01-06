package Arrays;

import java.util.*;

public class RemDuplicate26 {
    public static void findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for(int i = 0; i <nums.length; i++){
            if(i < nums.length -1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                break;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        System.out.println("Remove Duplicate from sorted Array");

        int[] nums = {1,2,6,6,2,9,9,5};

        findDuplicate(nums); 
    }
}
