// Problem: Valid Anagram
// Topic: Strings + Sorting

// Description:
// Check if two strings are anagrams of each other.
// Two strings are anagrams if they contain the same characters 
// with the same frequency.

//Example:
// Input: s = "listen", t = "silent"
// Output: true

// Input: s = "rat", t = "car"
// Output: false

// Approach:
// Sort both strings and compare them.

// Time Complexity: O(n log n)
// Space Complexity: O(n)
// */




package strings;
import java.util.Arrays;

public class validanagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}