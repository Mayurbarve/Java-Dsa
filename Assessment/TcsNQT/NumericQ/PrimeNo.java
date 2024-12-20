package Assessment.TcsNQT.NumericQ;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        System.out.println("Number is Prime or Not");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count++;cf
            }
        }

        if(count == 2){
            System.out.println("is prime");
        }else{
            System.out.println("Not Prime");
        }

    }
}
