package strings;
public class vowelconstants {
    // static int a;

    public static void main(String[] args) 
    {
     String str="apple";
    int constants=0 ;
    int vowels=0;
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
       if(ch>='a' && ch<='z')
       {

            if(ch=='a' || ch=='e'  ||ch=='o' ||ch=='u' || ch=='i')
            {
            //vowels=str.
            vowels++;
        //System.out.print("number of vowels:" + count);
            }
            else
            {
            constants++;
            }
    
        }
    }
    System.out.println("number of vowels:" + vowels);
    System.out.println("number of constants:" + constants);
}
}
    
    

