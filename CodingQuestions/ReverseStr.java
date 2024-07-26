package CodingQuestions;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println("Reverse String");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String string = scan.nextLine();
        scan.close();

        // for (int i = 0; i < str.length() / 2; i++) {
        //     int start = i;
        //     int end = str.length() - 1 - i;

        //     char frontChar = str.charAt(start);
        //     char endChar = str.charAt(end);

        //     str.setCharAt(start, endChar);
        //     str.setCharAt(end, frontChar);
        // }
        // System.out.print("Reverse String: "+ str);
        stringReverse(string);
        
    }

    static void stringReverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse String: " + rev);
    }
}
