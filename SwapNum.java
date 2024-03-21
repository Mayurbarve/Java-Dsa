//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class SwapNum {
    public SwapNum() {
    }

    public static void main(String[] args) {
        System.out.println("Number swaping");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("After Swaping");
        System.out.println("A = " + b);
        System.out.println("B = " + a);
    }
}

