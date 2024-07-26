package CodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class MergedTwoArrays {
    public static void main(String[] args) {
        System.out.println("Union of Two Arrays");

        int[] arrOne = { 1, 3, 5 };
        int[] arrTwo = { 2, 4, 5 };

        ArrayList<Integer> mergedArrays = methodOne(arrOne, arrTwo);

        System.out.println("Method One");
        for (int num : mergedArrays) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Method Two");
        ArrayList<Integer> mergedArraysTwo = methodTwo(arrOne, arrTwo);

        for (int num : mergedArraysTwo) {
            System.out.print(num + " ");
        }
    }

    // Methd One
    static ArrayList<Integer> methodOne(int[] arrOne, int[] arrTwo) {
        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> mergedArrays = new ArrayList<>();

        while (i < arrOne.length) {
            if (set.add(arrOne[i])) {
                mergedArrays.add(arrOne[i]);
            }
            i++;
        }

        while (j < arrTwo.length) {
            if (set.add(arrTwo[j])) {
                mergedArrays.add(arrTwo[j]);
            }
            j++;
        }

        return mergedArrays;
    }

    // Method Two
    static ArrayList<Integer> methodTwo(int[] arrOne, int[] arrTow) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arrOne) {
            set.add(num);
        }

        for (int num : arrTow) {
            set.add(num);
        }

        ArrayList<Integer> mergedArrayList = new ArrayList<>(set);

        return mergedArrayList;
    }
}
