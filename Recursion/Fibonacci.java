
public class Fibonacci {

    // static void printFibo(int a, int b, int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.print(c + " ");
    //     printFibo(b, c, n - 1);
    // }
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter nth Number: ");
        // int n = in.nextInt();
        // int a = 0, b = 1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");

        // printFibo(a, b, n - 2);
        // in.close();
        System.out.print(fibo(5));
    }
}
