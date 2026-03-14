package recursion;

public class pallindromerecursion {
    static int rev=0;
    static  void reverse(int n)
{
if(n==0)  //base case
    return ;
int digits=n%10;
rev=rev*10+digits;
reverse(n/10);  //recursive call
}
    public static void main(String[] args) {
        int n=121;
        int original=n;
        reverse(n);
        if(original==rev)
           System.out.println("Pallindrome");

        else
            System.out.println("not pallindrome");

    }
}
