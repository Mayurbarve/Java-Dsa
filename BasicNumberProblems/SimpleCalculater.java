//Simple Calculator
package BasicNumberProblems;
import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true){
            System.out.println("Enter Operator");
            int opt = in.next().trim().charAt(0); 

            if(opt == '+' || opt == '-' || opt == '*' || opt == '/' || opt == '%'){
                System.out.println("Enter Number");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                in.close();
                if(opt == '+'){
                    ans = num1 + num2;
                }
                if(opt == '-'){
                    ans = num1 + num2;
                }
                if(opt == '*'){
                    ans = num1 + num2;
                }
                if(opt == '/'){
                    ans = num1 + num2;
                }
                if(opt == '%'){
                    ans = num1 + num2;
                }
                else if (opt == 'x' || opt == 'X'){
                    break;
                }
                else{
                    System.out.println("Invalid operator");
                }
            }
            System.out.println("Result is: " + ans);
            
        }
    }

}