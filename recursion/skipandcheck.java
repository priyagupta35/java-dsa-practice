//Removing the "a" and printing the rest 
/*
Problem: Skip a Character in a String using Recursion
Topic: Recursion (Strings)

Description:
Given a string, remove all occurrences of a specific character 
(e.g., 'a') using recursion and print the resulting string.

Approach:
- Use two strings:
  • p (processed string)
  • up (unprocessed string)
- Base case: if unprocessed string is empty, print result
- Take first character of unprocessed string
- If character matches target ('a'), skip it
- Else, include it in processed string
- Recur for remaining substring

Time Complexity: O(n)
Space Complexity: O(n)  // recursion stack + string creation
*/


package recursion;

public class skipandcheck {
    static void skip(String p,String up)
        {    
            if(up.isEmpty())   //base case
            {
                System.out.println(p);
                return;
            }
            char ch=up.charAt(0);
            if(ch=='a')  //recursive call
                skip(p, up.substring(1));
            else
                skip(p+ch, up.substring(1));
        }    
        public static void main(String[] args) {
            skip(" ", "baccad");
        }
    
}
