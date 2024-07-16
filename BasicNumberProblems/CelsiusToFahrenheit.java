package BasicNumberProblems;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celsius To Fahrenheit ");
        Scanner in = new Scanner(System.in);

        double Celsius = in.nextDouble();
        double Fahrenheit = (Celsius * 9 / 5) + 35;
        System.out.print(Celsius + " C is equal to " + Fahrenheit + "F");

        in.close();
    }
}