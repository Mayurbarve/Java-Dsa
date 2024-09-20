package Assessment.Accenture;
import java.util.*;


public class LargestSmallSum {
    public static int largeSmallSum(int[] arr){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size() -2) + odd.get(1);
    }
    public static void main(String[] args) {
        System.out.println("Largest Small Sum");

        int[] arr = {3,2,1,7,5,4 };

        System.out.println(largeSmallSum(arr));
    }
}
