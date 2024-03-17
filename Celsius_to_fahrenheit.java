//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class celsius_to_fahrenheit {
    public celsius_to_fahrenheit() {
    }

    public static void main(String[] args) {
        System.out.println("Celsius to Faherenheit");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the celsius: ");
        float celsius = in.nextFloat();
        float Faherenheit = celsius * 9.0F / 5.0F + 32.0F;
        System.out.println("Celsius is: " + celsius + " Faherenheit is: " + Faherenheit);
    }
}
