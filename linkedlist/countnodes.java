

/**
 * Problem: Count the number of nodes in a singly linked list
 * Approach: Traverse the list and increment a counter
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class countNodes {

    Node head;

    // Method to count number of nodes
    int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        countNodes list = new countNodes();

        // Creating linked list: 10 -> 30 -> 60 -> 70
        list.head = new Node(10);
        list.head.next = new Node(30);
        list.head.next.next = new Node(60);
        list.head.next.next.next = new Node(70);

        System.out.println("Number of nodes: " + list.count());
    }
}


