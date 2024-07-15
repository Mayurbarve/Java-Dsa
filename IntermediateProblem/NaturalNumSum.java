package IntermediateProblem;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        System.out.println("| Sum of N Natural Number |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the N Number: ");
        int Num = in.nextInt();
        in.close();

        int res =0;
        for(int i = 1; i <= Num; i++ ){
            System.out.print(i + " ");
            res += i;
        }
        System.out.println("Sum is: "+ res);
    }
}
