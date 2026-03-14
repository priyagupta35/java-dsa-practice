package recursion;

public class countdigit {
    static int digit(int num,int sum)
    {
        if(num==0)  // base case
            return 0;
        return 1+digit(num/10,sum);  //recursive call
    }
    public static void main(String[] args) {
        int n=1353784;
        int sum=0;
        int count=digit(n,sum);
        System.out.println(count);
    }
    
}
