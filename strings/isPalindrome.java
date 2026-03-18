/*
Problem: Check Palindrome String
Topic: Strings

Description:
A string is called a palindrome if it reads the same forward and backward.

Example:
"madam" → true
"hello" → false

Approach:
Compare characters from start and end moving towards center.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package strings;

public class isPalindrome {

    public static void main(String[] args) {

        String str = "abcvcba"; // removed extra space
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {

        // Handle null and empty
        if (str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}