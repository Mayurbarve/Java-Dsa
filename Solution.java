import java.util.HashSet;

public class Solution{
    public static void main(String[] args) {
        String str = "abcabcbb"; // Example input
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        // Set to store the characters in the current window
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window

        // Iterate over the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, remove characters from the left until it's removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
