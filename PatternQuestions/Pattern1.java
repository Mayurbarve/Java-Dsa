package PatternQuestions;

import java.util.Scanner;

/*
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * * 
*/

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the row Number: ");
        int n = in.nextInt();
        in.close();

        patternStar(n);
    }

    static void patternStar(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
