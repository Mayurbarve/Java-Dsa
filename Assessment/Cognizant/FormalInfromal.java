import java.util.Scanner;

/**
 * FormalInfromal
 * F = Students in Fromals
 * I = Students in InFormal
 */
public class FormalInfromal {
    static int infromalStudents(int n, String str){

        boolean flag = false;

        int i = 0;
        int j = n -1;
        
        while(i < n){
            if(str.charAt(i) == 'I'){
                if(flag){
                    break;
                }
                else{
                    flag = true;
                }
            }
            i++;
        }

        while (j >= i) {
            if(str.charAt(j) == 'I'){
                break;
            }
            j--;
        }

        if(i == n){
            return 0;
        }
        else{
            return j - i + 1;
        }

    }

    public static void main(String[] args) {
        System.out.println("Fromal and Informal Students");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Students");
        int N = sc.nextInt();

        System.out.println("Enter the Students");
        String str = sc.next();

        System.out.println(infromalStudents(N, str));
        sc.close();
    }
}