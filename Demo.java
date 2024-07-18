import java.util.Scanner;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        Scanner in  =  new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Num = in.nextInt();

        if(isArmstrong(Num)){
            System.out.println(Num +" is Armstrong");
        }
        else{
            System.out.println(Num +" is Not Armstrong Number");
        }
        in.close();
    }

    public static boolean isArmstrong(int num){
        int realNum = num;
        int digits = countNum(num);
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if(realNum == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countNum(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
