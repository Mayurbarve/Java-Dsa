//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class printNumber {
    public printNumber() {
    }

    public static void main(String[] args) {
        System.out.print("Enter First N Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int x;
        for(x = 1; x <= num; ++x) {
            System.out.println("" + x + " ");
        }

        System.out.print("Enter Second N Number: ");
        x = in.nextInt();

        for(int a = 1; a <= x; ++a) {
            System.out.print("" + a + " ");
        }

    }
}
