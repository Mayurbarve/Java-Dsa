package Assessment.TcsNQT;

public class Average {
    public static void main(String[] args) {
        System.out.println("Avarage of all elements");

        int[] nums = {45,40,37,29,42};

        int sumOfElement = 0;
        for(int i = 0; i < nums.length; i++){
            sumOfElement += nums[i];
        }

        System.out.println(sumOfElement);

        System.out.println("Average is: " + sumOfElement/(nums.length));
    }
}
