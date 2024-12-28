package Assessment.TcsNQT.NumericQ;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int copy = num;
        int rem = 0;

        while(num > 0){
            int temp = num% 10;
            num /= 10;

            rem= rem + temp*temp*temp;
        }

        if(copy == rem){
            System.out.println("is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }    
}
