
/*
Problem: Grade Classification Based on Marks
Topic: Conditional Statements (if-else)

Description:
Determine the grade of a student based on the marks entered 
by the user. The program uses conditional statements to 
classify marks into different grade categories.

Approach:
- Take input marks using Scanner
- Use if-else ladder to check ranges:
  • marks >= 90 → Grade A
  • marks >= 70 → Grade B
  • marks >= 50 → Grade C
  • marks >= 35 → Grade D
  • marks < 35 → Fail

Time Complexity: O(1)
Space Complexity: O(1)
*/
package Javabasics;
import java.util.*;
class grade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the marks: ");
             int marks=scanner.nextInt();
             if(marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks");
             }
            if(marks>=90)
            {
                System.out.println("GRADE A");
            }
            else if(marks>=70)
            {
                System.out.println("GRADE B");
            }
            else if(marks>=50)
            {
                System.out.println( "GRADE C");
            }
            else if(marks>=35)
            {
                System.out.println("GRADE D");
            }
            else{
                System.out.println(" FAIL");
            }
        }
        
    }
    
}
