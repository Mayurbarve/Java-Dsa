package CodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Remove Duplicate Elements");

        int[] arr = {1,2,2,2,3,4,5,6,7,7,8};

          List<Integer> distinctElement = removeDuplicate(arr);

        for(int num : distinctElement){
            System.out.print(num + " ");
        }
    }

    static List<Integer> removeDuplicate(int[] arr){
        List<Integer> UniqueElement = new ArrayList<>();

        for(int i : arr){
            if(!UniqueElement.contains(i)){
                UniqueElement.add(i);
            }
        }
        return UniqueElement;
    }
}
