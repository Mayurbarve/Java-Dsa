//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Function {
    public Function() {
    }

    public static void main(String[] args) {
        sub();
        int ans1 = ret();
        System.out.println(ans1);
        int paraans = sum3(20, 30);
        System.out.println(paraans);
        Scanner newstr = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = newstr.nextLine();
        String personlised = myGreet(name);
        System.out.println(personlised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void sub() {
        System.out.println("Sum of two Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum : " + sum);
    }

    static int ret() {
        System.out.println("Function return value");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = obj.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = obj.nextInt();
        int ans = n1 + n2;
        return ans;
    }

    static int sum3(int a, int b) {
        int add = a + b;
        return add;
    }
}
