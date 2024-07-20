/**
 * Solition
 */
public class Solition {

    public static void main(String[] args) {
        int a = 2;
        int b = 50;

        while (b > 0) {
            a = b % 2 + a;
            if(a % 3 == 0){
                System.out.println(a);
            }
            else{
                System.out.println(b - 1);
            }
            b = b / 5;
            a++;
        }
    }
    
}