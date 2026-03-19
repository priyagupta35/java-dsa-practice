/*
Problem: Implement Stack using Queue
Topic: Stack + Queue

Description:
Implement stack operations (push, pop, top, isEmpty) 
using a single queue. The goal is to simulate 
Last-In-First-Out (LIFO) behavior using a 
First-In-First-Out (FIFO) data structure.

Approach:
- Use a Queue (LinkedList implementation)
- On push:
  • Add the element to the queue
  • Rotate the previous elements to the back
  • This makes the newly added element come to the front
- Pop and top operations are performed directly from the front

Time Complexity:
Push: O(n)
Pop: O(1)
Top: O(1)
isEmpty: O(1)

Space Complexity: O(n)
*/



package stack;

import java.util.LinkedList;
import java.util.Queue;

public class stackQueue 
{
    
    private Queue<Integer>q;
    public stackQueue()
    {
        q=new LinkedList<>();
    }
    public void push(int x)
    {
        q.add(x);
    
    int size=q.size();
    for(int i=0;i<size-1;i++)
    {
        q.add(q.remove());
    }
}
public int pop()
{
    if(q.isEmpty())
    {
        System.out.println("stack is empty:");
        return -1;
    }
     return q.remove();
}
public int top()
{
    if(q.isEmpty())
    {
        System.out.println("stack is empty:");
        return -1;
    }
    return q.peek();
}
public boolean isEmpty()
{
    return q.isEmpty();
}
public static void main(String[] args) {
    stackQueue s=new stackQueue();
    s.push(3);
    s.push(4);
    s.push(6);
    s.push(12);
    s.push(34);
   // s.pop(6);
   // s.top();
    System.out.println("peek:" + s.top());
    System.out.println("pop:" +s.pop());
}
}
