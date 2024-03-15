//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public ArrList() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList(10);

        for(int i = 0; i < 5; ++i) {
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
