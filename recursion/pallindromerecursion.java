/*
Problem: Check Palindrome Number using Recursion
Topic: Recursion

Description:
Check whether a given number is a palindrome using recursion. 
A palindrome number is one that reads the same forward and backward.

Approach:
- Reverse the number using a recursive function
- Extract last digit using n % 10
- Build reversed number by multiplying previous result by 10 and adding digit
- Compare reversed number with original number

Time Complexity: O(n)   // n = number of digits
Space Complexity: O(n)  // recursion stack
*/




package recursion;

public class pallindromerecursion {
    static int rev=0;
    static  void reverse(int n)
{
if(n==0)  //base case
    return ;
int digits=n%10;
rev=rev*10+digits;
reverse(n/10);  //recursive call
}
    public static void main(String[] args) {
        int n=121;
        int original=n;
        reverse(n);
        if(original==rev)
           System.out.println("Pallindrome");

        else
            System.out.println("not pallindrome");

    }
}
