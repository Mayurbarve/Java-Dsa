//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PrimeNo {
    public PrimeNo() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            int c;
            for(c = 2; c * c <= n; ++c) {
                if (n % c == 0) {
                    return false;
                }
            }

            return c * c > n;
        }
    }
}
