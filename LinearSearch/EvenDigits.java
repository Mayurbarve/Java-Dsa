//Return how many of them contain an even number of digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));
    }

    public static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digit or not
    public static boolean even(int num) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        // return numberOfDigits % 2 ==0;
    }

    public static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

}
