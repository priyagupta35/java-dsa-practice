package arrays.arrays.binarysearch;
import java.util.*;
public class floorceil {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF THE ARRAY:");
    int n=in.nextInt();
    int [] arr=new int[n];
    int start=0;
    int end=arr.length-1;

    System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }

    System.out.println("ENTER THE TARGET:");
    int tar=in.nextInt();
    int ceil=-1;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
      //  System.out.println("Middle element:"+mid);
    if(tar>=arr[mid])
    {
        ceil=arr[mid];
        start=mid+1;
    }
    else if(tar<arr[mid])
    {
        ceil=arr[mid];
        end=mid-1;
    }
    else
    {
        start=mid+1;
    }
    }
    start=0;
    end=arr.length-1;
    int floor=-1;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        System.out.println("Middle element:"+mid);
    if(tar<=arr[mid])
    {
        floor=arr[mid];
        start=mid+1;
    }
    else if(tar<arr[mid])
    {
        floor=arr[mid];
        end=mid-1;
    }
    else
    {
        start=mid-1;

  }  
}
System.out.println("CEIL VALUE:"+ceil);
System.out.println("FLOOR VALUE:"+floor);
  in.close();
}
  }
