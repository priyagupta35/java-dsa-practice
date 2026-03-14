//Removing the "a" and printing the rest 

package recursion;

public class skipandcheck {
    static void skip(String p,String up)
        {    
            if(up.isEmpty())   //base case
            {
                System.out.println(p);
                return;
            }
            char ch=up.charAt(0);
            if(ch=='a')  //recursive call
                skip(p, up.substring(1));
            else
                skip(p+ch, up.substring(1));
        }    
        public static void main(String[] args) {
            skip(" ", "baccad");
        }
    
}
