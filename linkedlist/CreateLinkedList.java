// Problem: Create a Singly Linked List and insert elements at the end
//  *
//  * Approach:
//  * - Maintain a head pointer
//  * - For insertion:
//  *      • If list is empty → new node becomes head
//  *      • Else traverse till last node and attach new node
//  * - For display:
//  *      • Traverse from head and print values
//  *
//  * Time Complexity:
//  * - Insertion: O(n)
//  * - Display: O(n)
//  *
//  * Space Complexity: O(1)
//  */


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CreateLinkedList {

    Node head;

    // Insert at end
    void insert(int val) {

        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    // Display list
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        CreateLinkedList list = new CreateLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}