
public class stack_implement {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class Stack{
        Node next=null;
        Node head=null;
        int size=0;

        boolean isEmpty()
        {
            if(size == 0)
                return true;
            else
                return false;
        }

        void push(int val)
        {
            Node newNode= new Node(val);
            newNode.next=head;
            head=newNode;
            size++;
        }
        void display()
        {
            Node trav=head;
            while(trav != null)
            {
                System.out.print(trav.data +" ");
                trav=trav.next;
            }
            System.out.println();
        }
        void pop()
        {
            if(size == 0)
            throw new IllegalArgumentException("Stack underflow");
            // data=head.data;
            // temp=head;
            head=head.next;
            size--;
        }
        int top()
        {
            if(isEmpty())
            {
                throw new IllegalArgumentException("Stack is empty");
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
    }

}
