
/*
Problem: Print Triangle Pattern using Recursion
Topic: Recursion (Pattern Problems)

Description:
Print a right-angled triangle pattern of stars (*) 
using recursion instead of loops.

Approach:
- Use two parameters: rows (r) and columns (c)
- Base case: if r == 0, stop recursion
- If c < r:
    • Print "*"
    • Move to next column (c + 1)
- Else:
    • Move to next line
    • Reduce row count (r - 1) and reset column to 0

Time Complexity: O(n^2)
Space Complexity: O(n)  // recursion stack
*/

package recursion;

public class patternproblemtriangle {
        static void triangle(int r,int c)
        {
            if(r==0)    //base case
                return;
        if(c<r){              
            System.out.print("*");
        triangle(r, c+1);  //recursive call
        }        
       else{
                System.out.println();
                triangle(r-1, 0);
        }
    }
    public static void main(String[] args) {
        triangle(6, 1);
        
    }
    
}
