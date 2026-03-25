/*
Problem: Implement Queue using Array
Topic: Queue

Description:
Implement basic queue operations (add, remove, peek, display)
using an array.

Approach:
- Use front (f) and rear (r) pointers
- Insert from rear
- Remove from front

Time Complexity:
Add: O(1)
Remove: O(1)
Peek: O(1)

Space Complexity: O(n)
*/

package queue;

public class Arrayimplementation {

   public static class QueueA {

        private int f = -1;
        private int r = -1;
        private int size = 0;
        private int[] arr = new int[5];

        // Add (enqueue)
        public void add(int val) {

            if (r == arr.length - 1) {
                System.out.println("Queue is FULL");
                return;
            }

            if (f == -1) {
                f = r = 0;
            } else {
                r++;
            }

            arr[r] = val;
            size++;
        }

        // Remove (dequeue)
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is EMPTY");
                return -1;
            }

            int value = arr[f];
            f++;
            size--;

            return value;
        }

        // Peek
        public int peek() {

            if (size == 0) {
                System.out.println("Queue is EMPTY");
                return -1;
            }

            return arr[f];
        }

        // Display
        public void display() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {

        QueueA q = new QueueA();

        q.add(3);
        q.add(5);
        q.add(8);
        q.add(27);
        q.add(11);

        q.display();

        q.remove();

        System.out.println("After removal:");
        q.display();

        System.out.println("Size: " + q.getSize());
    }
}


