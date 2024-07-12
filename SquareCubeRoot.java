import java.util.Scanner;

public class SquareCubeRoot {
    public static void main(String[] args) {
        System.out.println("Find Cube And Square Root");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();

        System.out.println("Select the Option");
        System.out.println("1) Square Root");
        System.out.println("2) Cube Root");

        int choice = in.nextInt();
        in.close();

        switch (choice) {
            case 1:
                System.out.println("Square Root of " + num + " is " + (num * num));
                break;
            case 2:
                System.out.println("Cube Root of " + num + " is 5" + (num * num * num));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
