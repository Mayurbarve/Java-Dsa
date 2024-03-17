//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Condition_Statement {
    public Condition_Statement() {
    }

    public static void main(String[] args) {
        System.out.println("Salary and bonus");
        Scanner in = new Scanner(System.in);
        int Salary = in.nextInt();
        if (Salary <= 10000) {
            System.out.println("your Salary :" + Salary + " your bonus: 3000 Total :" + (Salary + 3000));
        } else if (Salary <= 20000) {
            System.out.println("your Salary :" + Salary + " your bonus: 2000 Total :" + (Salary + 2000));
        } else {
            System.out.println("your Salary :" + Salary + " your bonus: 1000 Total :" + (Salary + 1000));
        }

    }
}
