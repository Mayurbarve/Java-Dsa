package String;

import java.util.Scanner;

public class LengthOfStr {
    public static void main(String[] args) {
        System.out.println("Length Of the String");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.next();
        sc.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.print("Length of String is: " + count);
    }
}
