package String;

import java.util.Scanner;

public class CountVowels {

    static int countString(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count Number Of Vowels");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = in.nextLine();
        in.close();

        System.out.println("Total Vowels in String: " + countString(str));
        
    }
}
