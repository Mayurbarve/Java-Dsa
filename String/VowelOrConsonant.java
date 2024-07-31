package String;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Vowel Or Consonant");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Character: ");

        char ch = in.next().charAt(0);
        in.close();

        if(isVowel(ch)){
            System.out.println(ch + "is Vowel");
        }
        else if(Character.isLetter(ch)){
            System.out.println(ch + " iS Consonant");
        }
        else{
            System.out.println("Invalid Character");
        }
    }

    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
