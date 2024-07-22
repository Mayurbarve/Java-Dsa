package CodingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfNum {
    public static void main(String[] args) {
        System.out.println("Intersection of two arrays");
        Scanner in = new Scanner(System.in);

        System.out.println("ENter the Size of two arrays: ");
        int arrSize1 = in.nextInt();
        int arrSize2 = in.nextInt();

        Integer[] arrOne = new Integer[arrSize1];
        Integer[] arrTwo = new Integer[arrSize2];
        
        System.out.println("Enter the element of first array");
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = in.nextInt();
        }
        System.out.println("Enter the element of Second array");
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = in.nextInt();
        }

        Integer[] newArr = intersection(arrOne, arrTwo);
        System.out.println(Arrays.toString(newArr));   
        in.close(); 
    }

    public static Integer[] intersection(Integer[] arrOne, Integer[] arrTwo){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arrOne));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arrTwo));

        set1.retainAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }

}
