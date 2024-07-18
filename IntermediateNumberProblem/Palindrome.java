package IntermediateNumberProblem;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("| Palindrome Number |");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Nums = scan.nextInt();
        scan.close();

        int PalindromeNum = ReverseNums(Nums);

        if(Nums == PalindromeNum){
            System.out.println(PalindromeNum + " are Palindrome Number");
        }
        else{
            System.out.println("Number are not Palindrome");
        }

    }
    public static int ReverseNums(int n){
        int rever = 0;

        while(n > 0){
            int temp = n % 10;
            n /= 10;

            rever = rever * 10 + temp;
        }
        return rever;
    }
}
