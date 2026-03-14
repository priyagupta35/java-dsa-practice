 //creating linkedlist and displaying
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
    