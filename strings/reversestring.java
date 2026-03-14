package strings;
public class reversestring
 {
    public static void main(String[] args)
     {
        String s="welcome to the jungle";
        //char[] arr=s.toCharArray();
        String result=reversewords(s);
        System.out.println(result);
    }
     public static String reversewords(String s)
    {
        String[] words=s.trim().split("\\s+");
       int i=0;
        int j=words.length-1;
        while(i<j)
        {
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
        
            i++;
            j--;    
        }
return String.join(" ",words);
    }
}
    


    

