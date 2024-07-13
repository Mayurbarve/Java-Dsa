import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Greatest of two Number");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int Num1 = in.nextInt();
        System.out.print("Enter the Second Number: ");
        int Num2 = in.nextInt();

        if(Num1 > Num2){
            System.out.println(Num1+ " is Greater");
        }
        else if(Num1 < Num2){
            System.out.println(Num2+ " is Greater");
        }
        else{
            System.out.println("Both are Equal");
        }
        in.close();
        
    }
}
