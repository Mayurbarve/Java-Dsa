package CodingQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println("Second Largest Number");
        int[] arr = {1,2,3,4,5,8,6,7,9};

        ArrayList<Integer> secndLargestNum = new ArrayList<>();

        for(int i : arr){
            secndLargestNum.add(i);
        }
        Collections.sort(secndLargestNum);
        int secondNum = secndLargestNum.get(secndLargestNum.size() - 2);
        System.out.println("Second Largest Num is: " + secondNum);
    }
}
