package String;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        System.out.println("String Palindrome or Not");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String");
        String str = in.next();

        palindromeStr(str);
        in.close();
    }

    static void palindromeStr(String str){
        String rev = "";
        for (int i = str.length() -1; i >= 0;  i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);

        if(str.contentEquals(rev)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String are not Palindrome");
        }
    }

}
