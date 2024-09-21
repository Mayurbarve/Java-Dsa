
import java.util.Scanner;

public class Palindrome {
    static int palindromeOrNot(int n){
        int reverse = 0;
        while(n > 0){
            int temp = n % 10;
            n/= 10;

            reverse = reverse * 10 + temp;
        }
        return reverse;
        
    }
    public static void main(String[] args) {
        System.out.println("Palindrome Number");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = in.nextInt();

        int palin = palindromeOrNot(num);

        if(num == palin){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome");
        }
        in.close();
    }
}
