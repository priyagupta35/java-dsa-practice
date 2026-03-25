// Stack Using Queue (Java)

//  how to implement a **Stack (LIFO)** data structure using a **Queue (FIFO)** in Java.
// The implementation uses a **single queue** and modifies the push operation to maintain stack behavior:

// Push (O(n)): Insert the element into the queue and rotate the previous elements to bring the new element to the front.
// Pop (O(1)): Remove the front element of the queue.
// Top (O(1)): Access the front element of the queue.

// Concept
// Since a queue follows FIFO and a stack follows LIFO, we simulate stack behavior by rearranging elements inside the queue after every push operation.

//  Operations Supported

//  `push(int x)` → Adds an element to the stack
//  `pop()` → Removes the top element
//  `top()` → Returns the top element
//  `isEmpty()` → Checks if the stack is empty

// Time Complexity

//  Push: **O(n)**
//  Pop: **O(1)**
//  Top: **O(1)**




package stack;

import java.util.*;

public class Stackusingqueue {
    static class MyStack {
        Queue<Integer> q = new ArrayDeque<>();

        // Push operation
        public void push(int x) {
            q.add(x);

            // Rotate queue
            int size = q.size();
            for (int i = 0; i < size - 1; i++) {
                q.add(q.remove());
            }
        }

        // Pop operation
        public int pop() {
            if (q.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return q.remove();
        }

        // Top operation
        public int top() {
            if (q.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return q.peek();
        }

        // Check empty
        public boolean isEmpty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top()); // 30
        System.out.println(st.pop()); // 30
        System.out.println(st.pop()); // 20
    }
}