    class Node{
        int val; Node next;
        Node(int val){
            this.next=null; this.val=val;
        }
    }
    class list{
        Node head;
        void insert(int val)
        {
            Node node =new Node(val);
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
                void segregateoddeven()
                {
                    Node evenstart=null,evenend=null;
                    Node oddstart=null, oddend=null;
                        Node slow=head;
                        while(slow!=null)
                        {
                            if(slow.val%2==0)
                            {
                                if(evenstart==null)
                                {
                                    evenstart=evenend=slow;
                                }
                                else{
                                    evenend.next=slow;
                                    evenend=evenend.next;
                                }
                            }
                            else
                                {
                                    if(oddstart==null)
                                    {
                                        oddstart=oddend=slow;
                                    }
                                    else{
                                        oddend.next=slow;
                                        oddend=oddend.next;
                                    }

                            }
                            
                            slow=slow.next;
                        }
                            if(evenstart==null || oddstart==null)
                            {
                                return;
                            }
                            evenend.next=oddstart;
                            oddend.next=null;
                        
                        head = evenstart;
                    }
                
                
                void dispaly()
                {
                    Node temp=head;
                    while(temp!=null)
                    {
                        System.out.print(temp.val+"->");
                        temp=temp.next;
                        
                    }
                    System.out.println("null");

                }
            }
    public class segregatell {
        public static void main(String[] args) {
            list l=new list();
            l.insert(1);
            l.insert(2);
            l.insert(3);
            l.insert(4);
            l.insert(5);
            l.insert(6);
            l.dispaly();
            l.segregateoddeven();
            System.out.println("After segregation:");
            l.dispaly();
        }
    }
