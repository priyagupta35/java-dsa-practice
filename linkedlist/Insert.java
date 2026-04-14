 /*
 * Problem: Create a Singly Linked List and insert elements at the beginning
 *
 * Approach:
 * - Maintain a head pointer
 * - For insertion:
 *      • Create a new node
 *      • Point new node’s next to current head
 *      • Update head to new node
 *
 * - For display:
 *      • Traverse from head and print values
 *
 * Time Complexity:
 * - Insertion: O(1)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */
 
 
 class Node{
     Node next; int val;
Node(int val)
{
    this.next=null;
    this.val=val;
}
 }
 public class Insert{
  Node head;
void  insert(int val)
{
    //Node head;
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
    Insert list=new Insert();
    list.insert(10);
    list.insert(3);
    list.insert(9);
   list. insert(8);
   // list list = new list();
    list.display();
}
}
