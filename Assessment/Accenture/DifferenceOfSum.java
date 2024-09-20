package Assessment.Accenture;
/*
 * The function differenceOfSum(n,m) accepts two integers n,m as arguments find the sum of all numbers in range 
 * from 1 to m[both inclusive] that are divisible by n. return difference between sum od integers not divisible
 * by n with sum of number divisible by n
 * 
 * Input:
 * n:4
 * m:20
 * 
 * Output:
 * 90
 */

import java.util.Scanner;

public class DifferenceOfSum {
    public static int differenceOfSum(int n, int m){
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= m; i++) {
            if( i % n == 0){
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }

        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        System.out.println("Difference of Sum");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the First Argument: ");
        int n = sc.nextInt();

        System.out.println("Enter the Range: ");
        int m = sc.nextInt();
        sc.close();

        System.out.println(differenceOfSum(n,m));
    }
}
