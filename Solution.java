class Solution {
    public static void main(String[] args) {
        String str = "kanak";

        String newStr = "";

        for (int i = str.length() -1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }

        if(str.contentEquals(newStr)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}