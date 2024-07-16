package BasicNumberProblems;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("| Even or Odd Numbers |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Num = in.nextInt();
        in.close();

        if(Num % 2 == 0){
            System.out.println("Given Numberis Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }
    }
}
