import java.util.Scanner;

public class SwitchCount {
    static int swtichCount(int n, int[] arr){
        if(n == 0){
            return 0;
        }
        int count = 0;

        String currentPen;

        if(arr[0] % 2 == 0){
            currentPen = "even";
        }
        else{
            currentPen = "odd";
        }

        for (int i = 1; i < n; i++) {
            if(currentPen == "odd" && arr[i] % 2 ==0){
                currentPen = "even";
                count++;
            }
            if(currentPen == "even" && arr[i] % 2 != 0){
                currentPen = "odd";
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count odd to even Switch");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the Array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(swtichCount(N, arr));
        sc.close();
    }
}
