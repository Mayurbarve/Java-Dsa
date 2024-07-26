package CodingQuestions;

public class MissingNum {
    public static void main(String[] args) {
        System.out.println("Missing Number in Array");

        int[] arr = { 1, 2, 3, 5, 6, 7, 9, 8 };

        int totalElement = arr.length + 1;
        int totalSum = totalElement * (totalElement + 1) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Missing Number is: " + (totalSum - sum));
    }
}
