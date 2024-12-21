
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Remove vowels");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        StringBuilder newStr = new StringBuilder();
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
            else{
                newStr.append(Character.toString(ch));
            }
        }

        System.out.println("New String: "+ newStr);
        System.out.println("Vowels: " + vowelCount);
    }
}