import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Union of Two Arrays");

        int[] arrOne = { 23, 45, 3,3,3,3,3,3};
        int[] arrTwo = { 23, 45, 45, 88, 32, 56, 3 };

        ArrayList<Integer> mergedArrays = unionOfArray(arrOne, arrTwo);

        for (int num : mergedArrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static ArrayList<Integer> unionOfArray(int[] arrOne, int[] arrTwo) {
        HashSet<Integer> set = new HashSet<>();

        // Adding elements from the first array
        for (int num : arrOne) {
            set.add(num);
        }

        // Adding elements from the second array
        for (int num : arrTwo) {
            set.add(num);
        }

        // Converting HashSet to ArrayList
        ArrayList<Integer> mergedArrays = new ArrayList<>(set);

        return mergedArrays;
    }
}
