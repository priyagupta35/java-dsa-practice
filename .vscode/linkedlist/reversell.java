class reversell
{
    static Node head;
    static Node rev(Node head)
    {
        if(head==null  || head.next==null)
        {
            return head;
        }

        Node newnode =rev(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newnode;

    }
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
        System.out.println("null");
    }

//public static Object head;
    public static void main(String[] args) {
        head=new Node(90);
        head.next=new Node(80);
        head.next.next=new Node(60);
         System.out.println("Before reverse :");
            display();

           head=rev(head);
           System.out.println("reversed ll:");
             display();
    }
}
   


