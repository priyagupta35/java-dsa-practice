// Description:
// Print all elements of a queue while preserving its original state.

// Approach:
// - Use an auxiliary queue
// - Remove elements one by one
// - Print them
// - Store in second queue
// - Restore original queue

// Time Complexity: O(n)
// Space Complexity: O(n)
// */


package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class PrintusingQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
          q.add(4);
          q.add(56);
          q.add(2);
          q.add(33);
          q.add(77);
          q.add(99);
          Queue<Integer>q2=new ArrayDeque<>();
          while(q.size()>0)
            {
                System.out.print(q.peek());
                q2.add(q.remove());
            }
            while(q2.size()>0)
                {
                    q.add(q2.remove());
                }        
    }
    
}
