package JavaProblems;
import java.util.Scanner;

public class RepeatedNo {

    public static void main(String[] args) {
        System.out.println("| Repeated Number Count |");
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int num_count = in.nextInt();
        in.close();

        int count = 0;
        while ( n > 0){
            int rem = n % 10;
            if (rem == num_count){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Num Count " + count);
    }
}