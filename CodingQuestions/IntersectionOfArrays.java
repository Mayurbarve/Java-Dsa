package CodingQuestions;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        System.out.println("Intersection of two arrays");

        int[] arrOne = {1,2,3,4,5,6,7};
        int[] arrTwo = {4,5,6,8,9};

        ArrayList<Integer> intersectionOfArrays = intersections(arrOne, arrTwo);


        for(int num : intersectionOfArrays){
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> intersections(int[] arrOne, int[] arrTwo){
        int i = 0;
        int j = 0;

        ArrayList<Integer> merged = new ArrayList<>();

        while(i < arrOne.length && j < arrTwo.length){
            if(arrOne[i] < arrTwo[j]){
                i++;
            }
            else if(arrTwo[j] < arrOne[i]){
                j++;
            }
            else{
                merged.add(arrOne[i]);
                i++;
                j++;
            }
        }

        return merged;
    }
}
