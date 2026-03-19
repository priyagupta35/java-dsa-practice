/*
Problem: Count Number of Digits in an Integer
Topic: Recursion

Description:
Given an integer, count the total number of digits 
using recursion by repeatedly dividing the number by 10.

Approach:
- Define a recursive function that takes an integer
- Base case: if num == 0, stop recursion
- Divide the number by 10 in each call
- Count each recursive step as one digit

Time Complexity: O(n)   // n = number of digits
Space Complexity: O(n)  // recursion stack
*/
package recursion;

public class countdigit {
    static int digit(int num)
    {
        if(num==0)  // base case
            return 1;
        return 1+digit(num/10);  //recursive call
    }
    public static void main(String[] args) {
        int n=1353784;
       // int sum=0;
        int count=digit(n);
        System.out.println(count);
    }
    
}
