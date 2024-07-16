package IntermediateProblem;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Sum of Digit of a Number");
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();

        int sum = calculateSumOfDigits(number);

        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
