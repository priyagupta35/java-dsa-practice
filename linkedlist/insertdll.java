/*
 * Problem: Insert a node at the beginning of a Doubly Linked List
 *
 * Approach:
 * - Maintain a head pointer
 *
 * - For insertion:
 *      • Create a new node
 *      • If list is empty → new node becomes head
 *      • Else:
 *          - Set new node’s next to current head
 *          - Set current head’s prev to new node
 *          - Update head to new node
 *
 * - For display:
 *      • Traverse from head using next pointer
 *      • Print each node value
 *
 * Time Complexity:
 * - Insertion: O(1)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */

class Node {
    int val;
    Node next;
    Node prev;
    //Node  head;
    Node(int  val)   // default constructor
        {
        this.val=val;
        this.next=null;
        this.prev=null;
        }
    }
    class LinkedList
    {
       Node head;
    void insert(int val)  // inserting the values in the so creating the node
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    void insertdll(int val)
    {
        Node node1=new Node(val);
        
        if(head==null)
        {
           head=node1;
           return;
        }
        node1.next=head;
        head.prev=node1;
        head=node1;
        
    }

   //dOperationException("Unimplemented method 'display'");
    

  //  private insertdll.Node head;
    void display()
    {
    Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
     public class insertdll{
        public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(30);
        list.insert(50);
        list.insert(90);
        list.insert(60);
        list.insertdll(12);
        System.out.println("After insertion:");
        list.display();
                    
     }
    }
    