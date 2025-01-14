public class NPower {
    static double myPow(double x, int n) {

        long absN = Math.abs((long) n);

        if (n < 0) {
            return 1 / powHelper(x, absN); // Handle negative powers
        } else {
            return powHelper(x, absN);
        }
    }

    static double powHelper(double x, long n) {
        // Base case: Any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Divide-and-conquer
        double half = powHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half; // If n is even
        } else {
            return half * half * x; // If n is odd
        }
    }


    public static void main(String[] args) {
        System.out.println(myPow(1, -2147483648));
    }
}
