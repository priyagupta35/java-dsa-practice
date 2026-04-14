/*
 * Problem: Detect the starting node of a loop in a Singly Linked List
 *
 * Approach: Floyd’s Cycle Detection Algorithm
 *
 * - Step 1:
 *      • Use slow and fast pointers
 *      • slow moves 1 step, fast moves 2 steps
 *      • If they meet → loop exists
 *
 * - Step 2:
 *      • Move slow to head
 *      • Move both pointers one step at a time
 *      • Point where they meet → start of loop
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(1)
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
    Node  detectloopposition()
    {
    Node slow=head;
      Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
           // int pos=0;
            slow=head;
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next.next;
                //pos++;
            }
            return slow;
        }
    }
    return null;
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
    public class detetctloop {
        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            list.insert(90);
            list.insert(80);
            list.insert(70);
            list.insert(60);
            list.insert(44);
            list.display();
            Node temp = list.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = list.head.next.next;  // loop at node 30

        // Find start of loop
        Node start = list.detectloopposition();

        if (start != null) {
            System.out.println("Loop starts at node with value: " + start.val);
        } else {
            System.out.println("No loop found");
        }
    }
}