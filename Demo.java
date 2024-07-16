import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number");
        String nums = in.next();

        int revNum = Integer.parseInt(nums);

        int reverse = reverseFun(revNum);

        System.out.println("Reverse nUm is "+ reverse);
        in.close();
    }

    public static int reverseFun(int n){
        int sum = 0;

        while(n != 0){
            sum += n % 10; 
            n /= 10;
        }
         return sum;
    }






























    
}