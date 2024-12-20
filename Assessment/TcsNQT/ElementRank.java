package Assessment.TcsNQT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElementRank {
    public static int[] sortrank(int[] num) {
        int[] sorted = num.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> store = new HashMap<>();
        int rank =1;
        for(int num1 : sorted){
            if(!store.containsKey(num1)){
                store.put(num1, rank++);
            }
        }


        int[] newArr = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            newArr[i] = store.get(num[i]);
        }

        return newArr;

    }


    public static void main(String[] args) {
        System.out.println("Element of the array by its rank");
        
        int[] arr = {12,4,6,7,2,9,10};
        System.out.println("Orignel array: " + Arrays.toString(arr));
        int[] sortedrank = sortrank(arr);
        System.out.println("Rank array: " + Arrays.toString(sortedrank));


        
    }
}
