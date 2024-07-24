package PatternQuestions;

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
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the row Number: ");
        int n = in.nextInt();
        in.close();

        patternStar(n);
    }

    static void patternStar(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalColInzRow = i > n ? 2 * n - i: i; 
            for (int j = 1; j <= totalColInzRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
