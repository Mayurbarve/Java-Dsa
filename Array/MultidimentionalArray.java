//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public MultidimensionalArray() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        int row;
        int col;
        for(row = 0; row < arr.length; ++row) {
            for(col = 0; col < arr[row].length; ++col) {
                arr[row][col] = in.nextInt();
            }
        }

        for(row = 0; row < arr.length; ++row) {
            for(col = 0; col < arr[row].length; ++col) {
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for(row = 0; row < arr.length; ++row) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();
        int[][] var7 = arr;
        col = arr.length;

        for(int var5 = 0; var5 < col; ++var5) {
            int[] a = var7[var5];
            System.out.println(Arrays.toString(a));
        }

    }
}
