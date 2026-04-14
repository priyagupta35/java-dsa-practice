    
/*
 * Problem: Merge two sorted Singly Linked Lists into a single sorted list
 *
 * Approach:
 * - Maintain two pointers for both lists (f and s)
 *
 * - For merging:
 *      • Compare values of both nodes
 *      • Insert the smaller value into a new list
 *      • Move the corresponding pointer forward
 *
 * - After traversal:
 *      • If elements remain in first list → add them to result
 *      • If elements remain in second list → add them to result
 *
 * - Return the merged list
 *
 * - For display:
 *      • Traverse from head and print values
 *
 * Time Complexity:
 * - Merging: O(n + m)
 * - Display: O(n + m)
 *
 * Space Complexity: O(n + m)
 */


    // merge two linkedlist 
    
    class Node
    {
        //public static final Node head = null;
        Node next;
        int val;
        Node(int val){
            this.next=null;
            this.val=val;
        }
    }
    class ll{
        Node head;
        //static ll ans;
        void insertlast(int val)
        {
            Node node=new Node(val);
            if(head==null)
            {
                head=node;
                return;
            }
            //Node node=new Node(val);
        // node.next=head;
            //head=node;
            Node temp = head;
                while (temp.next != null) 
                    {
                    //System.out.print(temp.val + " -> ");
                    temp = temp.next;
                }
                temp.next=node;
                }

             
                void display()
    {
    // void display() {
                Node temp = head;
                while (temp!= null) {
                    System.out.print(temp.val + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
          // mergeing the two list by comparing each node of it 
        static ll mergelists(ll l1,ll l2)
        { 
            Node f=l1.head;
            Node s=l2.head;
            ll ans=new ll(); 
            while(f!=null && s!=null)
            {
                if(f.val<s.val)
                {
                    ans.insertlast(f.val);
                    f=f.next;
                }
                else{
                    ans.insertlast(s.val);
                    s=s.next;
                }
            }
                //s=s.next;
                while(s!=null)
                {
                    ans.insertlast(s.val);
                    s=s.next;
                    //eturn ans;
                }
                while(f!=null)
                {
                    ans.insertlast(f.val);
                    f=f.next;
                }
                return ans;

            }
            //return ans;
        }

    public class mergell {
        public static void main(String[] args) {

            ll list1 = new ll();
            list1.insertlast(1);
            list1.insertlast(3);
            list1.insertlast(5);

            ll list2 = new ll();
            list2.insertlast(2);
            list2.insertlast(4);
            list2.insertlast(6);

            ll merged = ll.mergelists(list1, list2);

            merged.display();
        }
    }

