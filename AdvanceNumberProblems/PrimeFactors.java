package AdvanceNumberProblems;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Prime Factors of Number");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Nums = scan.nextInt();

        for (int i = 2; i < Nums; i += 1) {
            while (Nums % i == 0) {
                Nums /= i;
                System.out.print(i + " ");
            }
        }
        if (Nums != 1) {
            System.out.print(Nums + " ");
        }
        scan.close();
    }

}
