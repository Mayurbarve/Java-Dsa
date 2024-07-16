package BasicNumberProblems;

import java.util.Scanner;

public class NPower {
    public static void main(String[] args) {
        System.out.println("| N Power of Number |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base Number: ");
        int base = in.nextInt();

        System.out.print("Enter the Exponent: ");
        int exponent = in.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of "+ exponent + " is " + result);
        in.close();

    }
}
