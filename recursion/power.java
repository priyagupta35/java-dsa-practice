package recursion;

public class power {
     static double mypow(double x,int n)
    {
        if( n==0) // base case
            return 1;
        return x*mypow(x, n-1);  //recursive call
    }  
    public static void main(String[] args) {
        int p=4;
        double x=2.000;
        double ans=mypow(x,p);
        System.out.print(ans);
    }
    
}
