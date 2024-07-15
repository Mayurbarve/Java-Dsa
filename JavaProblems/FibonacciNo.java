
//Fibonacci Number Series
package JavaProblems;

import java.util.Scanner;

class FibonacciNo {

    public static void main(String[] args) {
        System.out.println("Fibonacci Number Series");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

        }
        System.out.println("In index " + n + " Fibonacci number is " + b);
        in.close();
    }
}