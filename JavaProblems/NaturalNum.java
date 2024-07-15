package JavaProblems;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String args[]) {
        System.out.println("Natural Numbers");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the N Number: ");
        int Nnum = in.nextInt();
        in.close();

        for (int i = 0; i <= Nnum; i++) {
            System.out.print(i + " ");
        }
    }
}
