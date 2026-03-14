package arrays.arrays.binarysearch;
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
        return Arrays.equals(sArray,sArray);
    }

    public static void main(String[] args) {
        anagram ana=new anagram();
        System.out.println(ana.anagramString("CODING", "DOINCG"));
    }
    
}
