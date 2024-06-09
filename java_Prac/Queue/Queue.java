class Queue {
    // Node class representing each element in the queue
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Ensure next is initialized to null
        }
    }

    // Queue implementation class
    class Queue_imple {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Add an element to the end of the queue
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Return the element at the front of the queue
        public int peek() {
            if (head == null) {
                throw new IllegalStateException("Queue is empty");
            }
            return head.data;
        }

        // Remove and return the element at the front of the queue
        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int data = head.data;
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
            return data;
        }

        // Get the size of the queue
        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Queue_imple Q1 = queue.new Queue_imple();
        
        System.out.println(Q1.isEmpty()); 
        Q1.enqueue(7);
        Q1.enqueue(9);
        Q1.enqueue(55);
        Q1.enqueue(23);
        Q1.enqueue(18);
        Q1.enqueue(66);
        System.out.println(Q1.size()); 
        System.out.println(Q1.peek()); 
        System.out.println(Q1.pop()); 
        System.out.println(Q1.pop()); 
        System.out.println(Q1.size()); 
        System.out.println(Q1.peek()); 
    }
}
