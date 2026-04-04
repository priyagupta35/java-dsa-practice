class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.next=null;
        this.val=val;
    }
}   
    class ll
    {
        Node head;
        void insert(int val)
        {
            Node node=new Node(val);
            node.next=head;
            head=node;
        }
        void middlenode(Node head)
        {

            if(head==null)
            {
                return;
            }
            int size=0;
            Node temp=head;
            while(temp!=null)
            {
                size++;
                temp=temp.next;
            }
             int mid =size/2+1;
        }
        void removefromtheend(int n)
        {
           // Node node = head;

            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
            if(fast==null)
            {
                head=head.next;
                return;
            }
          // int n=
         while(fast!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }

         void display()
        {
            Node temp=head;
             while(temp!=null)
             {
                System.out.print(temp.val +"->");
                temp=temp.next;
             }
             System.out.println("middle node:" +temp.val);
        }
    }
    public class removefrom{
        public static void main(String[] args) {

        
            ll list=new ll();
            list.insert(20);
            
            list.insert(29);
            
            list.insert(2);
            
            list.insert(77);
            
            list.insert(6);
            
            list.insert(5);
            
            list.insert(4);
            list.insert(22);
           // list.middlenode(list.head);
            list.display();
          //  list.middlenode()
            list.removefromtheend(5);
            System.out.println("After removal:");
            list.display();
}
}
            
        


























            