
//=\]earching an elemnt in linkeldist 
public class searchll
 {
    static Node head;
    static boolean search(int key)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==key)
            
                return true;
                temp=temp.next;
        }
        return false;
    } 


    public static void main(String[] args)
     {
        searchll scl=new searchll();
        head =new Node(20);
        head.next=new Node(50);
        head.next.next=new Node(10);
        head.next.next.next=new Node(90);
        // scl.search(0)    }
    System.out.println(scl.search(10));
     }
 }


