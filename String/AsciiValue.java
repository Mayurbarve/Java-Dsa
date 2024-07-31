package String;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("ASCII Value of Characters");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        int charValue = ch;

        System.out.println("The ASCII value of " + ch + " is " + charValue);
    }
}
