//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class FibonacciNo {
    public FibonacciNo() {
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Number Series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        for(int count = 2; count <= n; ++count) {
            int temp = b;
            b += a;
            a = temp;
        }

        System.out.println("On Index " + n + " Fibonacci no is: " + b);
    }
}
