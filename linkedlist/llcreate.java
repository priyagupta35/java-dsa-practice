 //creating linkedlist and displaying


/*
 * Problem: Create a Singly Linked List with insertion at beginning and at end
 *
 * Approach:
 * - Maintain a head pointer
 *
 * - For insertion at beginning:
 *      • Create a new node
 *      • Point new node’s next to current head
 *      • Update head to new node
 *
 * - For insertion at end:
 *      • Create a new node
 *      • If list is empty → new node becomes head
 *      • Else:
 *          - Traverse till the last node
 *          - Attach new node at the end
 *
 * - For display:
 *      • Traverse from head and print values
 *
 * Time Complexity:
 * - Insertion at beginning: O(1)
 * - Insertion at end: O(n)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */
 class Node
     {
        int val;
        Node next;
        Node(int val)
        {
        this.val=val;
        this.next=null;
        }
    }
    class LinkedList
    {
        Node head;
    void insert(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
     void insertatlast(int val)
    {
        Node node=new  Node(val);
        if(head==null)
        {
            head=node;
            return;

        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
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

   class llcreate{    
public static void main(String[] args) {
    

{
    LinkedList list=new LinkedList();
    list.insert(90);
    list.insert(10);
    list.insert(30);
    list.insert(40);
     list.insertatlast(70);
    System.out.println("After insertion:");
    list.display();
    //list.delete()
    //System.out.println("After deletions: 30");
}
}
    }

    