//Reverse Number

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        System.out.println("Reverse Number");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}