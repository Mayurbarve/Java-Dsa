import java.util.Scanner;

public class Fibonacci {

    static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth Number: ");
        int n = in.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);

        printFibo(a, b, n - 2);
        in.close();
    }
}
