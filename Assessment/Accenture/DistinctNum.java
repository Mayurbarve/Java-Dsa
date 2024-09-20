package Assessment.Accenture;
import java.util.Scanner;

public class DistinctNum {
    public static void main(String[] args) {
        System.out.println("Arrat Input");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enterd array");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        in.close();

        System.out.println("Number of Distinct Element is " + findCount(arr));
    }

    public static int findCount(int[] ar){
        int count = 0;

        for(int i = 0; i < ar.length; i++){
            int flag = 0;
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] == ar[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                count++;
            }
        }
        return count;
    }

}