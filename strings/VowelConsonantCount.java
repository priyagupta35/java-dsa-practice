  
// Problem: Count Vowels and Consonants in a String
// Topic: Strings

// Description:
// Given a string, count the number of vowels and consonants.

// Example:
// Input: "apple"
// Output:
// Vowels: 2
// Consonants: 3

// Approach:
// Traverse the string and check each character.
// If it's a letter:
//   - Check if vowel (a, e, i, o, u)
//   - Else it's a consonant

// Time Complexity: O(n)
// Space Complexity: O(1)


package strings;

public class VowelConsonantCount {

    public static void main(String[] args) {

        String str = "apple";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // handle uppercase

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check only alphabets
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}