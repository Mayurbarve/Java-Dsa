//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class LargestNumber {
    public LargestNumber() {
    }

    public static void main(String[] args) {
        System.out.println("Largest Number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if (b > a) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Largest Number among Three number is: " + max);
    }
}
