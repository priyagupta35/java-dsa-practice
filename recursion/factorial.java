package recursion;

public class factorial {
    static int  fact(int n)
    {
        if(n==0 || n==1)  //base case
            return 1;
     
        return n*fact(n-1);  // recursive call
}   
            public static void main(String[] args) {
                int n=3;
                int result=fact(n);
                    System.out.print(result);
                
            }
        }

