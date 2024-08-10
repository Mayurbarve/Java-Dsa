package CodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class LargestFromDigits {
    public static void main(String[] args) {
        System.out.println("Largest Number From Given Digits");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Digits: ");
        String str = sc.nextLine();

        String newStr = "";

        for (int i = 0; i < str.length(); i++) 
            if(str.charAt(i) != ' ')
                newStr += str.charAt(i);
            
        char [] arr = newStr.toCharArray();

        Arrays.sort(arr);
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
        sc.close();
    }
}
