package IntermediateNumberProblem;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        System.out.println("Prime Number in Range");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int startRange = in.nextInt();
        System.out.print("Enter the Second Number: ");
        int endRange = in.nextInt();
        in.close();

        System.out.println("The Prime Numbers in Range of " + startRange + " to " + endRange + " are");

        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
        public static boolean isPrime(int num){
            if(num <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    
}
