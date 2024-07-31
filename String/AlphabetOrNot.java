package String;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        System.out.println("Alphabet or Not");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if(Character.isLetter(ch)){
            System.out.println(ch + " is Character");
        }
        else{
            System.out.println(ch + " is not Character");
        }
    }
}
