// Problem: Print Day of Week using Switch Case
// Topic: Java Basics (Switch Case)

// Description:
// Given a number from 1 to 7, print the corresponding day of the week.
// If the number is not between 1 and 7, print "INVALID".

// Approach:
// Used switch-case to map each number to a day.

// Time Complexity: O(1)
// Space Complexity: O(1)


package switchcase;

import java.util.*;
public class weeks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out. println("Enter rhe Day:+  ");
        int day=scanner.nextInt();
        switch (day) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thrusday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:if(day>=7 || day<1){
                System.out.println("INVALID");
                break;
            }
        }
        
        }
    
}
