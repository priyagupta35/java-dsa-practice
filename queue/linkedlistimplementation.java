// Problem: Implement Queue using Linked List
// Topic: Queue + Linked List

// Description:
// Implement queue operations using a singly linked list.

// Approach:
// - Maintain head (front) and tail (rear)
// - Add at tail
// - Remove from head

// Time Complexity:
// Add: O(1)
// Remove: O(1)
// Peek: O(1)

// Space Complexity: O(n)
// */


package queue;

public class linkedlistimplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.next=null;
            this.val=val;
        }
    }
    public static class queuell{
        Node head=null;
        Node tail=null;
        int size=0;
        //add
        public void add(int val)
        {
            Node temp=new Node(val);
            if(size==0)
            {
                 head=tail=temp;
                 // System.out.println("QUEUE IS EMPTY:");
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
          //remove
        public int remove()
        {
            if(size==0)
            {
                System.out.println("QUEUE IS EMPTY:");
                return -1;
            }
            int x=head.val;
             head=head.next;
             size--;
             return x;
        }

        //returns the top element
        public int peek(){
            if(size==0)
            {
                System.out.println("QUEUE IS EMPTY:");
                return -1;
            }
            return head.val;
        }

        // display
       public void display()
       { 
          Node temp=head;
          if(size==0)
            {
                System.out.println("QUEUE IS EMPTY:");
                return ;
            }
          while(temp!=null)
          {
            System.out.print(temp.val+ "-> ");
            temp=temp.next;
          }
          System.out.println();

       }
    }
    public static void main(String[] args) {
        queuell ql=new queuell();
        ql.add(3);
        ql.add(7);
        ql.add(8);
        ql.add(9);
        ql.add(12);
        ql.add(34);
        ql.display();
        System.out.println("peek:" +ql.peek());
        ql.remove();
        System.out.println("size:" +ql.size);
        ql.display();
    }
}
    
    

