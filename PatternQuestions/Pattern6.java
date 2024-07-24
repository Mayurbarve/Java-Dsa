package PatternQuestions;

import java.util.Scanner;

/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * * 
    *
*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ENter the no of rows: ");
        int n = in.nextInt();
        in.close();

        for (int row = 0; row < 2 * n; row++) {

            int totalColomnsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColomnsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColomnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}