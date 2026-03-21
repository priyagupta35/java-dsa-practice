
// Problem: Valid Anagram
// Topic: Strings + Sorting

// Description:
// Check if two strings are anagrams of each other.

// Approach:
// - Convert strings to char arrays
// - Sort both arrays
// - Compare them

// Time Complexity: O(n log n)
// Space Complexity: O(n)
    



package strings;
import java.util.Arrays;

public class anagram {
    public boolean anagramString(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();  
        //for(int i=0;i<s.length();i++)
        //{
          //  for(int j=0;j<t.length();j++)
            //{
        Arrays.sort(sArray);
        Arrays.sort(tArray);
           // }
        return Arrays.equals(sArray,tArray);
    }

    public static void main(String[] args) {
        anagram ana=new anagram();
        System.out.println(ana.anagramString("CODING", "DOINCG"));
    }
    
}
