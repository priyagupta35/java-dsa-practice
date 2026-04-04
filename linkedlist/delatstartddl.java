class Node{
    int val;
    Node prev;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void insert(int val)
    {
     Node node=new Node(val);
     if(head==null)
     {
        head=node;
        return;
     }
     node.next=head;
     head.prev=node;
     head=node;
    }

void delhead(int val)
{
   if(head==null)
   {
    System.out.println("list is empty");
   }
head = head.next;

        if (head != null) {
            head.prev = null;
        }
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

public class delatstartddl {
public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.insert(70);
    list.insert(90);
    list.insert(55);
    list.insert(33);
    list.display();
    list.delhead(90);
    System.out.println("After deletion:");
    list.display();
}   
}
