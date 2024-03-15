//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class array {
    public array() {
    }

    public static void main(String[] args) {
        int[] rnos = new int[5];
        int[] var10000 = new int[]{11, 22, 33, 44, 55};
        int[] ros = new int[5];
        System.out.println(ros);
        String[] arr = new String[4];
        System.out.println(arr[0]);
        int[][] arry = new int[][]{{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        for(int row = 0; row < arry.length; ++row) {
            for(int col = 0; col < arry[row].length; ++col) {
                System.out.print(arry[row][col] + " ");
            }

            System.out.println();
        }

    }
}
