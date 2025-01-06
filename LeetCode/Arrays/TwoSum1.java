package LeetCode.Arrays;
import java.util.*;


public class TwoSum1 {
    public static int[] twoSUM(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;

            if (map.containsKey(y)) {
                int index = map.get(y);
                if(index == i){
                    continue;
                }
                return new int[]{i ,index};
            }
        }
        return new int[]{};

        
    }
    public static void main(String[] args){
        System.out.println("Two Sum Problem No ");

        int[] nums = {1,4,6,7,2,3};
        int target = 9;

        int[] result = twoSUM(nums, target);

        System.out.println(Arrays.toString(result));

        
    }
}
