package String;

import java.util.Scanner;

public class ToggleChar {
    public static void main(String[] args) {
        System.out.println("Toggle Each Character");
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter String");
        String str = in.nextLine();
        StringBuilder toggleChar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                toggleChar.append(Character.toUpperCase(ch));
            }
            else{
                toggleChar.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(toggleChar);
        in.close();
    }
}
