package arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class maxdepth {
    public static int  validnestdepth(String s)
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
            st.pop();
            
        }
    }
     return maxdepth;
   }
 
 public static void main(String args[])
 {
    maxdepth md=new maxdepth();
    //String s="(1+(2+3))";
    System.out.println(md.validnestdepth("(1+(2+3))")) ;
 }
}



