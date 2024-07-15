package IntermediateProblem;

import java.util.Scanner;

public class NaturalNumReverse {
    public static void main(String[] args) {
        System.out.println("| Reverse N Natural Numbers |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the N Number: ");
        int nNum = in.nextInt();
        in.close();

        System.out.println("Reverse "+ nNum +" Natural Number are ");
        for(int i = nNum ; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
    
}