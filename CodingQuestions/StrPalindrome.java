package CodingQuestions;

import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome String");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The String: ");
        String str = scan.nextLine();
        scan.close();

        System.out.print("Entered String: " + str);
        System.out.println();

        boolean result = palindromeStr(str);
        if(result == true){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is Not Palindrome");
        }
    }

    static boolean palindromeStr(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.contentEquals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
