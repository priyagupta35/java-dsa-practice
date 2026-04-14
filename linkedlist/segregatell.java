/*
 * Problem: Segregate Even and Odd nodes in a Singly Linked List
 *
 * Approach:
 * - Traverse the list and divide nodes into two lists:
 *      • Even list
 *      • Odd list
 *
 * - Maintain:
 *      • evenStart, evenEnd
 *      • oddStart, oddEnd
 *
 * - For each node:
 *      • Detach node from original list
 *      • Add to respective list (even or odd)
 *
 * - Finally:
 *      • Connect even list with odd list
 *      • Update head to evenStart
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(1) (in-place rearrangement)
 */

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class list {
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

    void segregateoddeven() {
        Node evenstart = null, evenend = null;
        Node oddstart = null, oddend = null;

        Node slow = head;

        while (slow != null) {
            Node next = slow.next; // store next
            slow.next = null;      // break link

            if (slow.val % 2 == 0) {
                if (evenstart == null) {
                    evenstart = evenend = slow;
                } else {
                    evenend.next = slow;
                    evenend = slow;
                }
            } else {
                if (oddstart == null) {
                    oddstart = oddend = slow;
                } else {
                    oddend.next = slow;
                    oddend = slow;
                }
            }

            slow = next;
        }

        if (evenstart == null) {
            head = oddstart;
            return;
        }

        evenend.next = oddstart;
        head = evenstart;
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

public class segregatell {
    public static void main(String[] args) {
        list l = new list();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);

        l.display();

        l.segregateoddeven();

        System.out.println("After segregation:");
        l.display();
    }
}