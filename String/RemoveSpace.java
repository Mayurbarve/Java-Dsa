package String;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        System.out.println("Remove Space from String");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.nextLine();

        removeSpace(str);
        sc.close();
    }

    static void removeSpace(String str){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                ch++;
            }
            else{
                newStr.append(ch);
            }
        }
        System.out.println(newStr);
    }
}
