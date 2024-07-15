package JavaProblems;
import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        System.out.println("Round of Number");
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter Number: ");
        double num = in.nextDouble();
        in.close();

        long RoundedNum = Math.round(num);

        System.out.println("Rounded Number is: " + RoundedNum);

    }
}
