package String;

import java.util.Scanner;

public class RemoveVowels {

    static void removeVowels(String str){
        StringBuilder remVowel = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ch++;
            }
            else{
                remVowel.append(Character.toString(ch));
            }
        }

        System.out.println("New String: " + remVowel);
    }


    public static void main(String[] args) {
        System.out.println("Remove Vowels from a String");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = in.nextLine();

        removeVowels(str);
        in.close();
    }
}
