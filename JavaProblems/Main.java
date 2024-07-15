package JavaProblems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check your salary Bonous");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        in.close();
        if (salary >= 10000) {
            System.out.println("Salary is: " + salary + "+3000=" + (salary + 3000));
        } else if (salary >= 20000) {
            System.out.println("Salary is: " + salary + "+2000=" + (salary + 2000));
        } else {
            System.out.println("Salary is: " + salary + "+1000=" + (salary + 1000));
        }

    }
}
