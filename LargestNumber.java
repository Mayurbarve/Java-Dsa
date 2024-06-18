//LargestNumber

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Largest Number");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max is: " + max);
    }

}