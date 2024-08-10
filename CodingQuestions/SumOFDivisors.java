package CodingQuestions;

import java.util.Scanner;

public class SumOFDivisors {
    public static int sumOfDivisor(int num){
        int totalNum = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                totalNum += i;
            }
        }

        return totalNum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of the Divisors");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        in.close();

        System.out.print("Sum of Divisor is: " + sumOfDivisor(num));
    }
}
