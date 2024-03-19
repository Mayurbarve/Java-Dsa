//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Shadowing {
    static int x = 98;

    public Shadowing() {
    }

    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
