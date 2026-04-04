class Node
{
    Node next;
    int val;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class ll{
    Node head;
    Node tail;
    void insert(int val)
    {
Node node=new Node(val);
node.next=head;
head=node;
    }
    boolean removeduplicate()
    {
        Node node=head;
        if(node==null)
        {
            return true;
        }
        while(node.next!=null)
        {
            if(node.val==node.next.val)
            {
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
        return false;
    }
void display()
{
   // void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

public class duplicatell {
    public static void main(String[] args) {
        ll list=new ll();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(5);
        list.insert(7);

        list.display();
        list.removeduplicate();
        list.display();

    }
}
