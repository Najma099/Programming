
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    private void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head = newNode;
        } else {
            head = tail = newNode;
        }
        size++;
    }

    private void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            insertAtHead(data);
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    private void insertR(int idx, int data) {
        if (idx < 1 || idx > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void insert(int idx, int data) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (idx == 0) {
            insertAtHead(data);
        } else if (idx == size) {
            insertAtTail(data);
        } else {
            insertR(idx, data);
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void deleteHead() {
        if (head == null) {
            System.out.println("The linked list is empty!!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    private void deleteTail() {
        if (head == null) {
            System.out.println("The linked list is empty!!");
            return;
        }

        if (head == tail) {
            deleteHead();
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    }

    private void deleteR(int data) {
        if (head == null) {
            System.out.println("The linked list is empty!!");
            return;
        }

        if (head.data == data) {
            deleteHead();
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }

        // Element not found
        System.out.println("Data " + data + " doesn't exist in the list.");
    }

    public void delete(int data) {
        if (size == 0) {
            System.out.println("LinkedList is Empty!!!");
            return;
        }

        if (head.data == data) {
            deleteHead();
        } else if (tail.data == data) {
            deleteTail();
        } else {
            deleteR(data);
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(0, 10);
        list.insert(1, 20);
        list.insert(2, 30);
        list.insert(0, 78);
        list.insert(4, 88);
        list.display(); 
        
        list.delete(20);
        list.display(); 

        list.delete(10);
        list.display(); 

        list.delete(30);
        list.display(); 

        
        list.delete(40); // Non-existent element

        System.out.println("Size: " + list.size); 
        System.out.println("Is Empty: " + list.isEmpty()); 

        // Test for empty list
        list.delete(78);
        list.delete(88);
        System.out.println("Size after deleting all elements: " + list.size); 
        System.out.println("Is Empty after deleting all elements: " + list.isEmpty()); 
    }
}
