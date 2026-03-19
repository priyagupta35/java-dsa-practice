/*
Problem: Basics of Queue Implementation
Topic: Queue (Java Collections Framework)

Description:
Demonstrates basic operations of a Queue using Java's 
LinkedList implementation. Elements are inserted into 
the queue and removed in FIFO (First-In-First-Out) order.

Approach:
- Use Queue interface with LinkedList class
- Add elements using add()
- Remove elements using remove()
- Observe FIFO behavior by removing elements sequentially

Time Complexity:
Enqueue (add): O(1)
Dequeue (remove): O(1)
Peek: O(1)

Space Complexity: O(n)
*/


package queue;

import java.util.LinkedList;
import java.util.Queue;



public class basicsofqueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(2);
    
        queue.add(5);
    
        queue.add(3);
    
        queue.add(4);
    
        queue.add(6);
    
        queue.add(7);
    
        queue.add(9);
        //System.out.println(queue.peek()); // 2 it returns the first element of the queue but does mot removes it
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove()); //removes the element from queue
    }

    
}
