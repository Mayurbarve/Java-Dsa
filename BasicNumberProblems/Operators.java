package BasicNumberProblems;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators in Java");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();

        System.out.println("Select an Operation: \n1) + 2) - 3) * 4) / 5) Exit (Enter E)");
        int choice = in.nextInt();
        in.close();

        switch (choice) {
            case 1:
                System.out.println("Addition of Number: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of Number: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of Number: " + (num1 * num2));
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Number not divide by 0");
                }
                else{
                    System.out.println("Division of Number: " + (num1 / num2));
                }
                
                break;
            case 5:
                System.out.println("Exit");
                break;
            
            default:
                System.out.println("Enterd invalid choice");
                break;
        }
    }
}
