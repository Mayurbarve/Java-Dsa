package AdvanceNumberProblems;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        System.out.println("ArmStrong in Range");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int startRange = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        int endRange = scan.nextInt();

        for(int i = startRange; i <= endRange; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }

    public static boolean isArmstrong(int num){
        int orignalNum = num;
        int sum = 0;
        int digits = countDigit(num);

        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if(orignalNum == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countDigit(int num){
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
