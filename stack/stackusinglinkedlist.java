// Problem: Implement Stack using Linked List
// Topic: Stack + Linked List

// Description:
// Implement stack operations (push, pop, peek, isEmpty) 
// using a singly linked list.

// Approach:
// - Use a Node class
// - Maintain a pointer 'top'
// - Perform operations at the head

// Time Complexity:
// Push: O(1)
// Pop: O(1)


package stack;
//constructor
    class Node{
        int val; Node next;
        Node(int val)
        {
            this.next=null; this.val=val;
        }
    }
    public class stackusinglinkedlist 
    {
        private Node top;
    
    public  stackusinglinkedlist(){
        top=null;
    
    }
    //push operation inserting the elments
    public void push(int val)
    {
     Node node=new Node(val);
     node.next=top;
     top=node;
    }
  //pop operation deleting  a element
  public int pop()
  {
    if(top==null)
    {
        System.out.println("STACK UNDERFLOW:");
        return -1;
    }
    int value =top.val;
    top=top.next;
    return value;
  }
  //peek operation return the top element but not removing it
  public int peek()
  {
    if(top==null)
    {
        System.out.println("STACK IS EMPTY:");
        return-1;
    }
    return top.val;
  }
  //cheking is stack is empty or not
  public boolean isEmpty()
  {
    return top==null;
  }
  void display()
  {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
  
  public static void main(String[] args) {
    stackusinglinkedlist s=new stackusinglinkedlist();
    s.push(23);
    s.push(22);
    s.push(12);
    s.push(11);
    s.push(18);
    s.push(55);
    //s.pop(11);
    s.display();
    System.out.println("peek:"+ s.peek());
   System.out.println("pop:" +s.pop());
    System.out.println("peek after pop:" +s.peek());
    s.display();

  }
        
    }
