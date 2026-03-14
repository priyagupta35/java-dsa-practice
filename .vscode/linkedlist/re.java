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
        public static void removefromtheend(Node head,int n, Node node)
        {
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
            if(head==null)
            {
                head=node;
                return;
            }
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
        }
    }
    public class remov
        public static void main(String[] args) {

        
            ll list=new ll();
            list.insert(20);
            
            list.insert(29);
            
            list.insert(2);
            
            list.insert(77);
            
            list.insert(6);
            
            list.insert(5);
            
            list.insert(4);
            list.display();
            list.removefromtheend(a, 4, 3);
            list.display();
}
}
            
        

























