package BasicNumberProblems;
import java.util.Scanner;

public class SquareCubeRoot {
    public static void main(String[] args) {
        System.out.println("Find Cube And Square Root");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        double num = in.nextDouble();

        System.out.println("Select the Option");
        System.out.println("1) Square Root");
        System.out.println("2) Cube Root");

        int choice = in.nextInt();
        in.close();

        switch (choice) {
            case 1:
                System.out.println("Square of " + num + " " + Math.sqrt(num));
                break;
            case 2:
                System.out.println("Cube of " + num + " " + Math.cbrt(num));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
