
/*
 * Problem: Search an element in a Singly Linked List
 *
 * Approach:
 * - Traverse the list from head
 * - Compare each node value with the target key
 * - If match found → return true
 * - If end reached without match → return false
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(1)
 */


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class searchll {

    static Node head;

    static boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        head = new Node(20);
        head.next = new Node(50);
        head.next.next = new Node(10);
        head.next.next.next = new Node(90);

        System.out.println(search(10)); // true
        System.out.println(search(99)); // false
    }
}