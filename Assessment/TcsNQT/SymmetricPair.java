package Assessment.TcsNQT;
import java.util.HashMap;
import java.util.Map;

public class SymmetricPair {
    public static void symmetric(int[][] arr){
        Map<Integer, Integer> store = new HashMap<>();
        for(int[] nums : arr){
            int first = nums[0];
            int second = nums[1];
            if(!store.containsKey(second)){
                store.put(first, second);
            }
            else{
                System.out.println("(" + first + "," + second + ")");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Symmetric pair in an array");
        int[][] arr = {{1,2},{2,1},{3,4},{5,4},{5,4}};
        symmetric(arr);
    }
}
