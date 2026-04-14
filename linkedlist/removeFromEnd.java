/*
 * Problem: Remove the Nth node from the end of a Singly Linked List
 *
 * Approach:
 * - Use two pointers (slow and fast)
 *
 * - Step 1:
 *      • Move fast pointer n steps ahead
 *      • If fast becomes null → remove head node
 *
 * - Step 2:
 *      • Move both pointers until fast reaches last node
 *
 * - Step 3:
 *      • Remove node by linking slow.next to slow.next.next
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(1)
 */


class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.next=null;
        this.val=val;
    }
}   
    class ll
    {
        Node head;
        void insert(int val)
        {
            Node node=new Node(val);
            node.next=head;
            head=node;
        }
         void removefromtheend(int n)
        {
            Node slow=head;
            Node fast=head;

            for(int i=1;i<=n;i++)
            {
                if(fast==null){
                fast=fast.next;
            }
        }

            if(fast==null)
            {
                head=head.next;
                return;
            }
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }

         void display()
        {
            Node temp=head;
             while(temp!=null)
             {
                System.out.print(temp.val +"->");
                temp=temp.next;
             }
        }
    }
    public class removeFromEnd{
        public static void main(String[] args) {

        
            ll list=new ll();
            list.insert(20);
            
            list.insert(29);
            
            list.insert(2);
            
            list.insert(77);
            
            list.insert(6);
            
            list.insert(5);
            
            list.insert(4);
            list.display();
            list.removefromtheend( 4);
            System.out.println("After deletion:");
            list.display();
}
    }



            
        

























