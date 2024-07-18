package AdvanceNumberProblems;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int armNum = scan.nextInt();

        scan.close();


        if(isArmstrong(armNum)){
            System.out.println(armNum + " is ArmStrong Number");
        }
        else{
            System.out.println(armNum + " are not Armstrong Number");
        }
    }

    public static boolean isArmstrong(int num){
        int trueNum = num;
        int sum = 0;
        int digits = countDigit(num);

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if(trueNum == sum){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

