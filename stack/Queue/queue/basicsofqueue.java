package stack.Queue.queue;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

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
