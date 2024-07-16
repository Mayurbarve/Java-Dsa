package IntermediateNumberProblem;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("| Prime Number or Not |");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Num = in.nextInt();
        in.close();

        Boolean isPrime = true;

        if (Num <= 1) {
            isPrime = false;
        }
        else{
            for(int i = 2; i <= Math.sqrt(Num); i++){
                if(Num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(Num+ " is Prime Number");
        }
        else{
            System.out.println(Num + " is Not Prime Number");
        }
    }
}
