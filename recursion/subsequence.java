package recursion;

import java.util.ArrayList;

public class subsequence {
    static void subseq(String p,String up)  //method for subequence 
    { 
        if(up.isEmpty())  // base case
            {
                //ArrayList<String>list =new ArrayList<>();
             System.out.println(p);
             //list.add(p);
             return;
        }
        char ch=up.charAt(0);
    subseq(p+ch, up.substring(1));  //recursive call
        subseq(p, up.substring(1));
        subseq(p, up);

      
    }
    static ArrayList<String> subseqret(String p,String up) //method for subsequence getting the final output as in array form
    { 
        if(up.isEmpty())  // base case
            {
                ArrayList<String>list =new ArrayList<>();
             // System.out.println(p);
             list.add(p);
             return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqret(p+ch, up.substring(1));  //recursive call
        ArrayList<String>right=subseqret(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p,String up)  //subseqence with ASCII vslue 
    { 
        if(up.isEmpty())  // base case
            {
                //ArrayList<String>list =new ArrayList<>();
             System.out.println(p);
             //list.add(p);
             return;
        }
        char ch=up.charAt(0);
    subseqAscii(p+ch, up.substring(1));  //recursive call
        subseqAscii(p, up.substring(1));
         subseqAscii(p+(ch+0), up.substring(1));  //to get ascii value char ch="a";  SOPLN(ch+0) gives the ascii value 
}
 static ArrayList<String> subseqretascii(String p,String up)   // subseqence with ASCII vslue and get the output in array form
    { 
        if(up.isEmpty())  // base case
            {
                ArrayList<String>list =new ArrayList<>();
             // System.out.println(p);
             list.add(p);
             return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=subseqret(p+ch, up.substring(1));  //recursive call
        ArrayList<String>second=subseqret(p, up.substring(1));
        ArrayList<String>third=subseqret(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
public static void main(String[] args) {
   System.out.println(subseqret("", "abc"));
    subseqAscii("","abc");
    System.out.println(subseqretascii("", "abc"));
}
}
