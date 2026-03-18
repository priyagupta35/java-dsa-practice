
//Problem: Longest Common Prefix
// Topic: Strings

// Description:
// Find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example:
// Input: ["flower","flow","flight"]
// Output: "fl"

// Input: ["dog","racecar","car"]
// Output: ""

// Approach:
// Sort the array and compare the first and last strings.
// The common prefix of these two will be the answer.

// Time Complexity: O(n log n + m)
// Space Complexity: O(1)
// */
package strings;
import java.util.*;

public class longestcommonprefix {
   // private static final String[] fly = null;

    public String longestcommonprefix(String[] str)
    {
        if(str==null|| str.length==0)
        {
            return "";       //retuen empty string 
         }
         Arrays.sort(str);  // sorts the array in squence
         String first=str[0];
         String last=str[str.length-1];
         
         int i=0;
         while(i<first.length() && i<last.length()  &&  first.charAt(i)==last.charAt(i))
         {
            i++;
      
         }
         return first.substring(0,i);
    
     }

     public static void main(String[] args) {
        longestcommonprefix obj=new longestcommonprefix();
     
        String[] s={"fly","flyover","flower"};
        String result=obj.longestcommonprefix(s);
        System.out.println("longest common prefix : " +result);
     }
    }
