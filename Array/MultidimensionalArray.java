package Array;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("Multidimensional Array");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the coloms: ");
        int col = in.nextInt();
        System.out.print("Enter the Row: ");
        int row = in.nextInt();

        int[][] mulArr = new int[col][row];

        for (int i =0; i < mulArr.length; i++){
            for(int j =0; j<mulArr.length; j++){

                mulArr[i][j]= (int)(Math.random()*10);
            }
        }
        for (int i =0; i < mulArr.length; i++){
            for(int j =0; j<mulArr.length; j++){
                System.out.print(mulArr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();

    }
    
}