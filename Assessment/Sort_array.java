package Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_array {
    public static void main(String[] args) {
        System.out.println("Array Sorting");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int arrsize = in.nextInt();

        int[] main = new int[arrsize];
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        System.out.println("Enter " + arrsize + " Element");

        for (int i = 0; i < arrsize; i++) {
            main[i] = in.nextInt();
        }
        for (int i = 0; i < arrsize; i++) {
            if (i % 2 == 0) {
                even.add(main[i]);
            } else {
                odd.add(main[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array ");
        for (int e : even)
            System.out.print(e + " ");
            System.out.println();
        System.out.println("sorted odd array ");
        for (int e : odd)
            System.out.print(e + " ");
            System.out.println();

        int evensec = even.get (even.size() -2);
        int oddsec = odd.get (odd.size() -2);

        System.out.println("Second Largest Element in Even list is "+ evensec);
        System.out.println("Second Largest Element in Odd list is "+ oddsec);
        System.out.println("Sum od second Largest Element of Even and Odd List: "+ (evensec + oddsec));
        in.close();

    }
}
