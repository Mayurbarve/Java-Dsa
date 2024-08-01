public class Solution {
    public static void main(String[] args) {
        String str = "12abc34def56"; // Example input
        System.out.println("The sum of numbers in the string is: " + sumOfNumbers(str));
    }

    public static int sumOfNumbers(String str) {
        int sum = 0;
        String temp = "0"; // To store temporary numbers as string

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a digit, add it to the temporary string
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                // Convert the temporary string to an integer and add to sum
                sum += Integer.parseInt(temp);
                // Reset the temporary string
                temp = "0";
            }
        }

        // Add any remaining number in the temporary string to the sum
        sum += Integer.parseInt(temp);

        return sum;
    }
}
