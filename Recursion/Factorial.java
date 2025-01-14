public class Factorial {

    static int recursion(int n){
        if(n < 2){
            return 1;
        }
 
        int factorial = n * recursion(n - 1);
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        int totalSum = recursion(num);
        System.out.println(totalSum);
    }
}
