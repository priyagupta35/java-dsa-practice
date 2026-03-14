package recursion;

public class patternproblemtriangle {
        static void triangle(int r,int c)
        {
            if(r==0)    //base case
                return;
        if(c<r){              
            System.out.print("*");
        triangle(r, c+1);  //recursive call
        }        
       else{
                System.out.println();
                triangle(r-1, 0);
        }
    }
    public static void main(String[] args) {
        triangle(6, 1);
        
    }
    
}
