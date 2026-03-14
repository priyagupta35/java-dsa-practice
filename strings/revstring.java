package strings;
class revstring 
{
    public static void main(String[] args)
     {
    String str="WELCOME TO THE JUNGLE";
   // char[] arr=str.toCharArray();
      String result=reverseCharacter(str);  //convertingthe string into characters
    
    System.out.println(result);
    
}

public static String reverseCharacter(String s)
{
   char[] arr=s.toCharArray(); //string to characterarray
    int i=0;
    int j=s.length()-1-i;
    while(i<j)     //till reaches the centre
    {
        char temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        i++;
        j--;
 
    }
    return new String(arr);  //returns the reverse strings with letters also reversed
    
}
}


