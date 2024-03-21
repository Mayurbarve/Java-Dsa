//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class VarArgs {
    public VarArgs() {
    }

    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 9, 11, 15, 20, 25, 35, 50);
        multiple(2, 3, "mayura");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println("" + a + " " + b + " " + Arrays.toString(v));
    }

    static void fun(int... a) {
        System.out.println(Arrays.toString(a));
    }
}
