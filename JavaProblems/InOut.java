// Input and Output
package JavaProblems;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        System.out.println("Input and Output");
        // for INput Scanner
        Scanner n = new Scanner(System.in);

        int num = n.nextInt();

        // for Output System.oout.print
        System.out.println("Enterd Input is: "+ num);
        n.close();
    }

}