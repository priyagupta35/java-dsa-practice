package recursion;

public class sumofnumbers {
    static int  sum(int n)
    {
        if(n==0)  //base caae
            return 0;
        return n+sum(n-1);  // recursive call
        
    }

    public static void main(String[] args) {
        int n=3;
        int result=sum(n);
        System.out.println(result);
    }
}
