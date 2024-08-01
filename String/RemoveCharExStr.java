package String;

import java.util.Scanner;

public class RemoveCharExStr {

    static void removeChar(String str){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))){
                newStr.append(str.charAt(i));
            }
            else{
                i++;
            }
        }

        System.out.println(newStr);
    }
    public static void main(String[] args) {
        System.out.println("Remove Character Expect STring");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = in.nextLine();

        removeChar(str);
        in.close();
    }
}
