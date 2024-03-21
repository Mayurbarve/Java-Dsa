//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class SwapinArray {
    public SwapinArray() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        int ind1;
        for(ind1 = 0; ind1 < arr.length; ++ind1) {
            arr[ind1] = in.nextInt();
        }

        System.out.println("Enter Swaping index");
        ind1 = in.nextInt();
        int ind2 = in.nextInt();
        swap(arr, ind1, ind2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
