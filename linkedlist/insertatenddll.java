/*
 * Problem: Create a Doubly Linked List and perform insertion at beginning and at end
 *
 * Approach:
 * - Maintain two pointers: head and tail
 *
 * - For insertion at beginning:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Set new node’s next to current head
 *          - Set current head’s prev to new node
 *          - Update head to new node
 *
 * - For insertion at end:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Link current tail’s next to new node
 *          - Set new node’s prev to tail
 *          - Update tail to new node
 *
 * - For display:
 *      • Traverse from head using next pointer
 *      • Print each node value
 *
 * Time Complexity:
 * - Insertion at beginning: O(1)
 * - Insertion at end: O(1)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */

/*
 * Problem: Create a Doubly Linked List and perform insertion at beginning and at end
 *
 * Approach:
 * - Maintain two pointers: head and tail
 *
 * - For insertion at beginning:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Set new node’s next to current head
 *          - Set current head’s prev to new node
 *          - Update head to new node
 *
 * - For insertion at end:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Link current tail’s next to new node
 *          - Set new node’s prev to tail
 *          - Update tail to new node
 *
 * - For display:
 *      • Traverse from head using next pointer
 *      • Print each node value
 *
 * Time Complexity:
 * - Insertion at beginning: O(1)
 * - Insertion at end: O(1)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */

/*
 * Problem: Create a Doubly Linked List and perform insertion at beginning and at end
 *
 * Approach:
 * - Maintain two pointers: head and tail
 *
 * - For insertion at beginning:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Set new node’s next to current head
 *          - Set current head’s prev to new node
 *          - Update head to new node
 *
 * - For insertion at end:
 *      • Create a new node
 *      • If list is empty → head and tail point to new node
 *      • Else:
 *          - Link current tail’s next to new node
 *          - Set new node’s prev to tail
 *          - Update tail to new node
 *
 * - For display:
 *      • Traverse from head using next pointer
 *      • Print each node value
 *
 * Time Complexity:
 * - Insertion at beginning: O(1)
 * - Insertion at end: O(1)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */

class Node{
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
         Node tail;
    void insert(int val)  // inserting the values in the so creating the node
    {
        Node node=new Node(val);
        if (head == null) {   // empty list
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    void insertatlast(int val)
    {
        //Node node1=new Node(val);
        Node node = new Node(val);
        if (tail == null) {   // empty list
            head = tail = node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
    }


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
    public class insertatenddll {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(40);
        list.insert(70);
        list.insert(80);
        list.display();
         list.insertatlast(50);
         //list.display();
        System.out.println("After insertion:");
         list.display();
   }
    }


