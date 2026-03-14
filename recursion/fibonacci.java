package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        int ans=f(n);
        System.out.println(ans);
    }
    

static int f(int n)
{
    if(n<=1)
        return n;
    else
        return f(n-1)+f(n-2);
}
}