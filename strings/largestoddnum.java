// Problem: Largest Odd Number in String
// Topic: Strings

// Description:
// Given a numeric string, return the largest-valued odd number 
// that is a substring of the given string.

// Example:
// Input: "5678"
// Output: "567"

// Input: "4206"
// Output: ""

// Approach:
// Traverse from right to left and find the first odd digit.
// Return substring from start to that index.

// Time Complexity: O(n)
// Space Complexity: O(1)

package strings;
//import java.util.*;
public class largestoddnum {

    public String largestoddnum(String s)
    {
        int ind=-1;

for(int  i=s.length()-1;i>=0;i--)
{
    if((s.charAt(i)-'0')%2==1)
    {
        ind=i;
        break;
    }
}
 if(ind==-1)
 {
    return "";
 }
 int start=0;
 while(start<=ind && s.charAt(start)=='0')
 {
    start++;
 }
 return s.substring(start, ind+1);
}

public static void main(String[] args) {
    largestoddnum obj=new largestoddnum();
    String num="5678";
    String result=obj.largestoddnum(num);
    System.out.println("largest odd number:" + result);
    //obj.largestoddNum
}
}
