public class Factorial {

    static int recursion(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int nums = recursion(n - 1);
        int factorial = n * nums;
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        int totalSum = recursion(num);
        System.out.println(totalSum);
    }
}
