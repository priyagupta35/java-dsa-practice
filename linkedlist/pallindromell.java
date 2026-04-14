   /*
 * Problem: Check if a Singly Linked List is a Palindrome
 *
 * Approach:
 * - Use two-pointer technique (slow and fast)
 *
 * - Step 1: Find middle of the list
 *      • Move slow by 1 step and fast by 2 steps
 *      • When fast reaches end → slow is at middle
 *
 * - Step 2: Reverse second half of the list
 *      • Call recursive reverse function on slow.next
 *
 * - Step 3: Compare both halves
 *      • Compare nodes from start and reversed second half
 *      • If any mismatch → not palindrome
 *
 * - Step 4: Restore original list
 *      • Reverse second half again and reconnect
 *
 * - Return true if all values match, else false
 *
 * Time Complexity:
 * - Finding middle: O(n)
 * - Reversing: O(n)
 * - Comparison: O(n)
 *
 * Overall: O(n)
 *
 * Space Complexity:
 * - O(n) (due to recursion stack)
 */
   
   
   
   class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    class LinkedList{
        Node head;
        void insert(int val)
        {
            Node node=new Node(val);
            node.next=head;
            head=node;
        }
        Node Reverserec(Node head)
        {
            if(head==null || head.next==null)
            {
                return head;
            }
            Node newhead=Reverserec(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
        }
      
        boolean ispalindrome()
        {
        if(head==null || head.next==null)
                return true;
            

        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node newhead=Reverserec(slow.next);
        Node firsthalf=head;
        Node secondhalf=newhead;
        while(secondhalf!=null)
        {
            if(firsthalf.val!=secondhalf.val)
            {
                Reverserec(newhead);
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;

        }
        slow.next=Reverserec(newhead);
        return true;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public class pallindromell {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(7);
        list.insert(4);
        list.insert(2);
        //list.insert(3);

        
        list.display();

        if(list.ispalindrome())
            System.out.println("linkedkist is pallindrome:");
        else
            System.out.println("not pallindrome:");
            
        list.display();
        }
        
    }   

