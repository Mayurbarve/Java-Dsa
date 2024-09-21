

import java.util.Scanner;

public class PrimeRange {
    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            } 
        }
        return true;
    }

    static void primeRange(int a, int b) {
        if (a >= 0 && b >= 0 && a <= b) {
            for (int num = a; num <= b; num++) {
                if (checkPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("Enter valid range");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Prime number in given range");

        System.out.println("Enter the range");
        int startNum = in.nextInt();
        int endNum = in.nextInt();
        in.close();

        primeRange(startNum, endNum);
    }
}
