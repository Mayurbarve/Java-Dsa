package IntermediateNumberProblem;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = in.nextLine();
        in.close();

        System.out.println("String: " + str);

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        
    }
}
