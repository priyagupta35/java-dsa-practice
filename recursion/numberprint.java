package recursion;
public class numberprint {
static void print(int n)
{
    if(n==0)   //base case
        return;
   // print(n-1);   // recursive call
    System.out.println(n +" ");
     print(n-1);   // recursive call

}

    public static void main(String[] args) {
        int n=7;
        print(n);
    
}
}
