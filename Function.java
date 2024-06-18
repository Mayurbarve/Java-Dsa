// Function

import java.util.Scanner;

public class Function {

    static void Fubonacci(int n) {
        System.out.println("Function in Java");

        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

        }
        System.out.println("In index " + n + " Fibonacci number is " + b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Fubonacci(num);
        in.close();
    }
}