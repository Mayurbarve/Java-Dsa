package Assessment.TcsNQT.NumericQ;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Binary to Decimal conversion");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int res = 0;
        int i = 0;

        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;

            res= res + rem *(int)Math.pow(2, i++);
        }

        System.out.println(res);
    }
}
