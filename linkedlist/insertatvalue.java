/*
 * Problem: Insert a node after a given value in a Singly Linked List
 *
 * Approach:
 * - Maintain a head pointer
 *
 * - For insertion at beginning:
 *      • Create a new node
 *      • Point new node’s next to current head
 *      • Update head to new node
 *
 * - For insertion after a given value:
 *      • Traverse the list using a temporary pointer
 *      • If target value is found:
 *          - Create a new node
 *          - Set new node’s next to temp.next
 *          - Link temp.next to new node
 *      • If value not found → print message
 *
 * - For display:
 *      • Traverse from head and print values
 *
 * Time Complexity:
 * - Insertion at beginning: O(1)
 * - Insertion at value: O(n)
 * - Display: O(n)
 *
 * Space Complexity: O(1)
 */


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class insertatvalue {

    static Node head;

    static void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    static void insertAtValue(int target, int val) {

        Node temp = head;

        while (temp != null) {

            if (temp.val == target) {

                Node node = new Node(val);

                node.next = temp.next;
                temp.next = node;

                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found in list");
    }

    static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insert(40);
        insert(30);
        insert(20);
        insert(10);

        display();

        insertAtValue(20, 25);

        display();
    }
}