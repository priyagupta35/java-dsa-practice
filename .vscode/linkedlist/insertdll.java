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
        static Node head;
    void insert(int val)  // inserting the values in the so creating the node
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    void insertdll(int val)
    {
        Node node1=new Node(val);
        node1.next=head;
        if(head!=null)
        {
            node1.prev=null;
        }
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
    