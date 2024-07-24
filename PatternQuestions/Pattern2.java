package PatternQuestions;

/*
* 
* *
* * *
* * * *
* * * * * 
*/

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the row Number: ");
        int n = in.nextInt();
        in.close();

        patternStar(n);
    }

    static void patternStar(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
