 class Node{
     Node next; int val;
Node(int val)
{
    this.next=null;
    this.val=val;
}
 }
 public class Insert{
    //Node head;
static void  insert(int val)
{
    Node head;
    Node node=new Node(val);
    node.next=head;
    head=node;}

    void display()
    {
    Node temp=head;
             while(temp!=null)
             {
                System.out.print(temp.val +"->");
                temp=temp.next;
             }
             System.out.println("null");
        }
    

    
public static void main(String[] args) {
    insert(10);
    insert(3);
    insert(9);
    insert(8);
   // list list = new list();
    list.display();
}
}
