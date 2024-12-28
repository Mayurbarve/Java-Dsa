package String;
import java.util.Scanner;

class StrConsoVowel{
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args){
        System.out.println("Consonants, Vowels and Space in string");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        in.close();
        int vowel = 0;
        int consonant = 0;
        int space = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch)){
                vowel++;
            }
            else if(Character.isLetter(ch)){
                consonant++;
            }
            else{
                space++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonents: " + consonant);
        System.out.println("Space: " + space);

    }
}