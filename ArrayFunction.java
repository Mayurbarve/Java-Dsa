//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class arrayFunction {
    public arrayFunction() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 12, 65, 74, 87};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[1] = 25;
    }
}
