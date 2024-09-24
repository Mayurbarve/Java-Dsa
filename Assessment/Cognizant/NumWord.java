import java.util.Scanner;

public class NumWord {
    static void findDiviser(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if(num % 3 == 0 && num % 5 == 0){
                System.out.print("ThreeFive");
            }
            else if(num % 5 == 0){
                System.out.print("Five ");
            }
            else if(num % 3 == 0){
                System.out.print("Three ");
            }
            else{
                System.out.print(num +" ");
            }
        }
    }
    public static void main(String[] args){
        System.out.println("INput Number & diviser NumWord");
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("Enter the Four Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        findDiviser(arr);
        in.close();
    }
}
