
/*
 * Problem: Remove duplicates from a Sorted Singly Linked List
 *
 * Approach:
 * - Maintain a head pointer
 * - Traverse the linked list using a pointer (node)
 *
 * - For removing duplicates:
 *      • Start from the head node
 *      • Compare current node with next node
 *      • If values are equal:
 *          - Skip the next node by linking current node to next.next
 *      • Else:
 *          - Move to the next node
 *
 * - Important:
 *      • This approach works efficiently because the list is sorted
 *      • Duplicate elements are always adjacent
 *
 * - For display:
 *      • Traverse from head and print values
 *
 * Time Complexity:
 * - Insertion: O(n) (since inserting at end requires traversal)
 * - Removing Duplicates: O(n)
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

class LinkedList {
    Node head;

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

    void removeDuplicate() {
        if (head == null) return;

        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next; // skip duplicate
            } else {
                node = node.next;
            }
        }
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

public class DuplicateLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(5);
        list.insert(7);

        list.display();

        list.removeDuplicate();

        System.out.println("After removing duplicates:");
        list.display();
    }
}
