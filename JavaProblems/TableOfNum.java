package JavaProblems;
import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        System.out.println("Table of Number");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        

        System.out.println("Multiplication Table for " + num + ":");

        for (int i = 0 ; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
             
        }
        in.close();
    }
}
