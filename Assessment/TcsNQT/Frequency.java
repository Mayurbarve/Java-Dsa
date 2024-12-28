package Assessment.TcsNQT;

import java.util.HashSet;

public class Frequency {
    public static void main(String[] args) {
        System.out.println("Count Frequency of Element");

        int[] arr = {3,3,3,3,5,8,9,2,4,1,7,7,4,5,7,2,9,};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            if(!set.contains(arr[i])){
                for(int j = i +1; j<arr.length; j++){
                    if(arr[i]== arr[j]){
                        count++;
                    }
                    
                }
                System.out.println("Frequency of "+ arr[i] + " --> " + count);
                set.add(arr[i]);
                // System.out.println(set);
            }
            
            
        }
    }
}
