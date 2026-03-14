package arrays.arrays.binarysearch;
import java.util.*;

//mport javax.print.attribute.IntegerSyntax;
public class findmin 
 {

    public static void main(String[] args)
     {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n=in.nextInt();
        int []arr=new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for(int i=0;i<n;i++)
        {
        arr[i]=in.nextInt();
        }
//    System.out.println("ENTER THE MIDDLE ELEMENT:");


        int minimum=findmin(arr);
        System.out.println("THE MINIMUM ELEMEMTS IS:"+ minimum);
    in .close();

}    

    static int findmin(int [] arr)
    {
    int low=0;
    int high=arr.length-1;
    int ans=Integer.MAX_VALUE;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[low]<=arr[mid])
        {
            ans=Math.min(ans,arr[low]);
            low=mid+1;

        }
        else{
            ans=Math.min(ans,arr[mid]);
            high=mid-1;
        }
    }
    return ans;
}
}