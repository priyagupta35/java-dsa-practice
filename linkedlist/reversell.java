/*
 * Problem: Reverse a Singly Linked List using recursion
 *
 * Approach:
 * - Use recursion to reverse the list
 *
 * - Base Case:
 *      • If head is null or only one node → return head
 *
 * - Recursive Step:
 *      • Reverse the rest of the list
 *      • Make next node point back to current node
 *      • Set current node’s next to null
 *
 * - Return new head of reversed list
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(n) (due to recursion stack)
 */

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class reversell
{
    static Node head;
    static Node rev(Node head)
    {
        if(head==null  || head.next==null)
        {
            return head;
        }

        Node newnode =rev(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newnode;

    }
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
        System.out.println("null");
    }

//public static Object head;
    public static void main(String[] args) {
        head=new Node(90);
        head.next=new Node(80);
        head.next.next=new Node(60);
         System.out.println("Before reverse :");
            display();

           head=rev(head);
           System.out.println("reversed ll:");
             display();
    }
}
   


