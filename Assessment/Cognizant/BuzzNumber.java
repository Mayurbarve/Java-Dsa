import java.util.Scanner;

public class BuzzNumber {
    static boolean buzzNumber(int num){
        if(num % 10 == 7 || num % 7 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Number is Buzz or Not");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = in.nextInt();

        boolean buzz = buzzNumber(num);
        if(buzz){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not Buzz Number");
        }
        in.close();
    }
}
