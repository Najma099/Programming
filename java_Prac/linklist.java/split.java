public class split {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node[] split(Node head) {
        Node even = new Node(0);
        Node e = even;
        Node odd = new Node(0);
        Node o = odd;

        while (head != null) {
            if ((head.data & 1) == 0) { // Even
                e.next = head;
                e = e.next;
            } else { // Odd
                o.next = head;
                o = o.next;
            }
            Node temp = head.next; // Store the next node
            head.next = null; // Break the current node's link to avoid cycles
            head = temp; // Move to the next node
        }

        // Disconnect the dummy heads from the actual lists
        e.next = null;
        o.next = null;

        return new Node[] {even.next, odd.next};
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(6);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node[] result = split(a);
        Node evenHead = result[0];
        Node oddHead = result[1];

        System.out.println("Even list:");
        printList(evenHead);

        System.out.println("Odd list:");
        printList(oddHead);
    }
}
