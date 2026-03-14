public class countnodes {
    static Node head;
    static int count()
    {
       int c=0;
       Node temp=head;
       while(temp!=null)

        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static void main(String[] args) {
        head=new Node(10);
    head.next=new Node(30);
    head.next.next=new Node(60);
    head.next.next.next=new Node(70);
    System.out.println("Count:" +count());
    }
    
}
