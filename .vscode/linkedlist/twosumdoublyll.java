class Node {
    int val;  Node next;  Node prev;
    Node (int val)
    {
        this.next=null;  this.val=val;  this.prev=null;
    }
}
class linkedlist{

Node head;
void insertlast(int val)
{
    Node node=new Node(val);
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
    node.prev=temp;
    
    }
    boolean twosum(int target)
    {
         Node left=head;  Node right=head;
         while(right.next != null)
{
    right = right.next;
}
         while(left!=right && right.next!=left)
         {
            int sum=left.val+right.val;
            if(sum==target)

                {
                    System.out.println("Pair:"  +left.val+ "," +right.val);
                     return true;
                }
                else if(sum>target)
                {
                    right=right.prev;
                }
                else 
                {
                    left=left.next;
                }

            }
            return false;
         }
         void display()
         {
                Node temp = head;
                while (temp!= null) {
                    System.out.print(temp.val + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    
            
            public class twosumdoublyll {
                public static void main(String[] args) {
                    linkedlist list=new linkedlist();
                    list.insertlast(2);
                    list.insertlast(4);
                    list.insertlast(6);
                    list.insertlast(7);
                    list.insertlast(9);
                    list.insertlast(10);
                    list.insertlast(12);
                    list.display();
                    int target = 12;

                    if (list.twosum(target)) {
                        System.out.println("Pair found");
                    }
                            }
                
                        }
