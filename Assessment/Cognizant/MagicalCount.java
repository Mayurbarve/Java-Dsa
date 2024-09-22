
import java.util.Scanner;

public class MagicalCount {
    static int magicalRowCount(int[][] arr){
        int magicalCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int rowOddCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] % 2 != 0){
                    rowOddCount += arr[i][j];
                }
            }
            if(rowOddCount % 2 == 0){
                magicalCount++;
            }
        }

        return magicalCount;
    }
    public static void main(String[] args) {
        System.out.println("Magicl row Count in 2D array");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows");
        int row = sc.nextInt();

        System.out.println("Enter the Number of Column");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(magicalRowCount(arr));
        sc.close();
    }
}
