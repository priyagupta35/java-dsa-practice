package recursion;

public class productofdigits {
    static int product(int n)
    {
        if(n==0)   // base case
            return 1;
        return  n%10*product(n/10);  //recursive call
    }
    
    public static void main(String[] args) {
        int n=1953;
        int ans=product(n);
            System.out.println(ans);
        
    }
}
