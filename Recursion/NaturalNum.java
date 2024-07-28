/**
 * NaturalNum
 */
public class NaturalNum {

    static void recursion(int num){
        if(num == 11){
            return;
        }

        System.out.print(num + " ");
        recursion(num + 1);
    }

    public static void main(String[] args) {
        int num = 1;
        recursion(num);

    }
}