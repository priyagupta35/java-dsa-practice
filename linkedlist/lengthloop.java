/*
 * Problem: Find the length of a loop in a Singly Linked List
 *
 * Approach:
 * - Use Floyd’s Cycle Detection Algorithm (Tortoise and Hare)
 *
 * - Step 1: Detect loop
 *      • Initialize two pointers: slow and fast
 *      • Move slow by 1 step and fast by 2 steps
 *      • If they meet → loop exists
 *
 * - Step 2: Find loop length
 *      • Move one pointer ahead and keep the other fixed
 *      • Traverse the loop until both pointers meet again
 *      • Count the number of nodes in the loop
 *
 * - If no loop is detected:
 *      • Return -1
 *
 * - For display:
 *      • Traverse normally (only works when no loop is present)
 *
 * Time Complexity:
 * - Loop Detection: O(n)
 * - Loop Length Calculation: O(n)
 *
 * Space Complexity: O(1)
 */

class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
    }
    class LinkedList{
        Node head;
        void insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    int  lengthloopll()
    {
    Node slow=head;
      Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
           // int pos=0;
           int count=1;
           // slow=head;
           fast=fast.next;
            while(fast!=slow)
            {
               // slow=slow.next;
                fast=fast.next;
                //pos++;
                count++;
            }
            return count;
        }
    }
    return -1;
}
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
}
    public class lengthloop {
        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            list.insert(90);
            list.insert(80);
            list.insert(70);
            list.insert(60);
            list.insert(44);
            list.insert(33);
            list.insert(12);
            list.display();
            Node temp = list.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = list.head.next.next.next;  // loop at node 30

        // Find start of loop
        int count = list.lengthloopll();

      if (count != -1)
            System.out.println("Length of loop: " + count);
        else
            System.out.println("No loop found");
    }
}