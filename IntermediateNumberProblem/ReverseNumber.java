package IntermediateNumberProblem;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("| Reverse the Number |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the NUmber: ");
        int Nums = in.nextInt();
        in.close();

        int reverseNum = 0;

        while(Nums > 0){
            int rem = Nums % 10;
            Nums /= 10;

            reverseNum = reverseNum * 10 + rem;
        }

        System.out.println("Reverse Number is: " + reverseNum);
    }
}
