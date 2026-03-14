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
private void whilie(boolean b) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'whilie'");
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

