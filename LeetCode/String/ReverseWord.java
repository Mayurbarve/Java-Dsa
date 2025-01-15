import java.util.*;

public class ReverseWord {

    // Approach 1: Split and Reverse Using a Stack
    public static String reverseWordsUsingStack(String s) {
        // Trim leading and trailing spaces, split by spaces
        String[] words = s.trim().split("\\s+");
        Stack<String> stack = new Stack<>();

        // Push words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Build the result by popping words from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        // Remove the trailing space and return
        return result.toString().trim();
    }

    // Approach 2: Two Pointers
    public static String reverseWordsUsingTwoPointers(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;

        // Iterate backwards to find words
        while (end >= 0) {
            // Skip trailing spaces
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;

            // Find the start of the current word
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            // Add the word to the result
            result.append(s.substring(start + 1, end + 1)).append(" ");
            end = start - 1;
        }

        // Remove the trailing space and return
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        // Using Stack
        System.out.println("Using Stack:");
        System.out.println(reverseWordsUsingStack(s1)); // Output: "blue is sky the"
        System.out.println(reverseWordsUsingStack(s2)); // Output: "world hello"
        System.out.println(reverseWordsUsingStack(s3)); // Output: "example good a"

        // Using Two Pointers
        System.out.println("Using Two Pointers:");
        System.out.println(reverseWordsUsingTwoPointers(s1)); // Output: "blue is sky the"
        System.out.println(reverseWordsUsingTwoPointers(s2)); // Output: "world hello"
        System.out.println(reverseWordsUsingTwoPointers(s3)); // Output: "example good a"
    }
}
