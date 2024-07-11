import java.util.Scanner;

public class PosItiveOrNagative{
    public static void main(String[] args) {
        System.out.println("Positive or Nagative Numbers");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int num = in.nextInt();
        in.close();

        if(num < 0){
            System.out.println("Enterd Number is Nagative");
        }
        else if(num > 0){
            System.out.println("Enterd Number is Positive");
        }
        else{
            System.out.println("Enterd Number is 0");
        }
    }
}
