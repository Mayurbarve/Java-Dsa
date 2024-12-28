package Assessment.TcsNQT.NumericQ;
import java.util.Scanner;

public class PalindromeOrNot {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Palindrome or not");

        int num = in.nextInt();
        int copy = num;
        int rem = 0;

        while(copy != 0){
            int temp = copy % 10;
            copy/=10;

            rem = rem*10 + temp;
        }
        
        if(num==rem){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }

        in.close();
    }
}

