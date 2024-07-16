package IntermediateNumberProblem;

import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        System.out.println("| Sum of Number Given Range |");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range of Number: ");
        int StartRange = in.nextInt();
        int EndRange = in.nextInt();
        in.close();

        int sum = 0;
        
        for(int i = StartRange; i <= EndRange; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(" ");
        System.out.println("Sum of given Range is: "+ sum);
    }
}
