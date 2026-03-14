package strings;
import java.util.HashMap;
//import java.util.*;

public class isomorphic {
    public boolean  isomorString(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> mapST=new HashMap<>();
        HashMap<Character,Character> mapTS=new HashMap<>();

        for(int i=0;i<=s.length()-1;i++)
        {

            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mapST.containsKey(c1))
            {
                if(mapST.get(c1)!=c2)
                {
                    return false;
                }
                else{
                    mapST.put(c1,c2);
                }
            }

            if(mapTS.containsKey(c2))
            {
                if(mapTS.get(c2)!=c1)
                {
                    return false;
                }
                else{
                    mapTS.put(c2, c1);
                }
            }
           // return true;
        }
        return true;
    }
}

    public static void main(String[] args)
     {
        {
            isomorphic obj=new isomorphic();
            String str1="egg";
            String str2="add";
          //  String ans=obj.isomor(ans, ans) ;
          if(obj.isomorString(str1,str2)){
                  System.out.println("it is isomorphic");
          }
        else
        {
            System.out.println("not isomorphic");
        }

    }
}

     