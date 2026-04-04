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