// Problem: Maximum Nesting Depth of Parentheses
// Topic: Stack

// Description:
// Find the maximum depth of nested parentheses using a stack.

// Approach:
// - Push '(' onto stack
// - Pop when ')' appears
// - Track max size of stack

// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class maxdepthstack {
    public static int  validNestDepth(String s)
 {
    //boolean maxdepth =false;
    Deque<Character> st=new  ArrayDeque<>();  //initialise empty stack using deque
    int maxdepth=0;                           // maxdepth keeps the record of highest nest
   for(char ch:s.toCharArray())                //converting string to character array
   {
    if(ch=='(')
    {
        st.push(ch);
        maxdepth=Math.max(maxdepth, st.size());     //st.size  
    }
    else if (ch==')')
         {
             if (!st.isEmpty()) {
            st.pop();
             } 
        }
    }
     return maxdepth;
   }
 
 public static void main(String args[])
 {
   // maxdepth md=new maxdepth();
    //String s="(1+(2+3))";
    System.out.println(validNestDepth("(1+(2+3))")) ;
    System.out.println(validNestDepth("((()))"));    //3
        System.out.println(validNestDepth("()()"));    //1
 }
}



