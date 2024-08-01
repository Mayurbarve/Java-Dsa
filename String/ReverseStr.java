package String;

import java.util.Scanner;

public class ReverseStr {

    static void reverseString(String str){
        String rev = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        System.out.println("Reverse String");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String");
        String str = in.nextLine();

        reverseString(str);
        in.close();

    }
}
