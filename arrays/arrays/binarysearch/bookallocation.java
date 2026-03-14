package binarysearch;
import java.util.*;
public class bookallocation
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOOKS:");
        int n=in.nextInt();
        int arr[]=new int[n];
         System.out.println("ENTER THE NUMBER OF PAGES OF THE BOOK:");
         for(int i=0;i<n;i++)
         {
            arr[i]=in.nextInt();
         }

         System.out.println("ENTER THE NUMBER OF STUDENTS:");
          int m=in.nextInt();
         int result=allocatebook(arr,m,n);
         System.out.println("MIN POSSIBLE MAX PAGES:" + result);
         in.close();
    }

    static int allocatebook(int[] arr, int m, int n) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'allocatebook'");
       if(m>n)
       {
        return -1;
       }
    int sum=0;//int st=0,end=sum,ans=-1;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
    int st=0,end=sum,ans=-1;
    while(st<=end)
    {
       int mid=st+(end-st)/2;
     if(isvalid(arr,m,n,mid))
       {
        ans=mid;
        end=mid-1;
       }
      else
      {
        st=mid+1;
         }
    }

      return ans;
    }
static boolean isvalid(int arr[],int m,int n,int mid)
      {
        // TODO Auto-generated method stub
        //  throw new UnsupportedOperationException("Unimplemented method 'isvalid'");

        int st=1,pages=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>mid)
            {
                return false;
            }
                if(pages+arr[i]<=mid)
                {
                    pages+=arr[i];
                }
                else
                {
                    st++;
                    pages=arr[i];
                
                    
                if (st > m) 
                {
                    return false;
                }
                }
        }
        return true;
    }
}
