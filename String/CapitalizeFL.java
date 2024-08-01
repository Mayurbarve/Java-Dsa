package String;

import java.util.Scanner;

public class CapitalizeFL {
    public static void main(String[] args) {
        System.out.println("Captitalize the First and Last Charater of each Word of String");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = "12abc34def56";

        System.out.println("Total Sum od Digit is: " + capitalizeStr(str));
        sc.close();
    }

    static int capitalizeStr(String str){
        int sum = 0;
        String temp = "0";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   

            if(Character.isDigit(ch)){
                temp += ch;
            }
            else{
                sum += Integer.parseInt(temp);

                temp = "0";
            }
        }
        sum += Integer.parseInt(temp);

        return sum;
    }
}
