package Javabasics;
import java.util.*;
class grade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the marks: ");
             int marks=scanner.nextInt();
            if(marks>=90)
            {
                System.out.println("GRADE A");
            }
            else if(marks>=70)
            {
                System.out.println(" GRADE B");
            }
            else if(marks>=50)
            {
                System.out.println( " GRADE C");
            }
            else if(marks>=35)
            {
                System.out.println(" GRADE D");
            }
            else{
                System.out.println(" FAIL");
            }
        }
        
    }
    
}
