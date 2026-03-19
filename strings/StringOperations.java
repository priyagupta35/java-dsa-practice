// Problem: String Length and Case Conversion
// Topic: Java Strings (Basics)

// Description:
// Perform basic string operations:
// 1. Find length of string
// 2. Convert string to uppercase
// 3. Convert string to lowercase

// Example:
// Input: "My name is rahul"
// Output:
// Length: 16
// Uppercase: MY NAME IS RAHUL
// Lowercase: my name is rahul// Time Complexity: O(n)
// Space Complexity: O(n)
// */


package strings;
public class StringOperations {
    public static void main(String[] args) {
        String str="My name is rahul";
        int result=str.length();              //counts the number of letters in the string
         String upper=str.toUpperCase();      //converets into capital letters
         String lower=str.toLowerCase();      //convertinto small letters

         System.out.println(result);
         System.out.println(upper);
         System.out.println(lower);
    }
    
}
