package recursion;

public class concept {
    static void conceptpass(int n)
    {
        if(n==0)  //base case
        return;
    System.out.println(n);
    conceptpass(--n);  //recursive call

    }
    public static void main(String[] args) {
        int n=5;
        conceptpass(n);
    }
    
}
