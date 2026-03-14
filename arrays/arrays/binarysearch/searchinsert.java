package arrays.arrays.binarysearch;
  import java.util.*;
  public class searchinsert {
  public static void main(String[] args) {
      
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SIZE EOF THE ARRAY:");
    int n=in.nextInt();
    int [] nums=new int[n];
    int start=0;
    int end=n-1;
    System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
    for(int i=0;i<n;i++)
    {
      nums[i]=in.nextInt();
    }
    System.out.println("ENTER THE TARGET:");
    int tar=in.nextInt();

  // int start=0;
    //nt end=n-1;
    int tarindex=n;
    while(start<=end)
    {
      int mid=start+(end-start)/2;
      System.out.println("Middle element:" +  mid);
      

      if(tar==nums[mid])  //target==mid value
      {
          tarindex=mid;
          break;
          //System.out.println("index of the target element:"+ mid);
      }
      else if(tar>nums[mid])  // search in rightside
      {
        start=mid+1;
        
      }
      else // search in left side 
      {
          end=mid-1;
          
      }
  }
      if(tarindex==n)
      {
          tarindex=start;
          System.out.println("Target index should be inserted at index:"+ tarindex);
      }
      //System.out.println("Index of the target element:"+ nums[tarindex]);
    
    in.close();

  }
  }

