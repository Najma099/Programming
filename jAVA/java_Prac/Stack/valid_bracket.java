//import basic.Node;

public class valid_bracket {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class Stack{
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
        
        void pop()
        {
            if(isEmpty())
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
        void display()
        {
            Node trav=head;
            while(trav != null)
            {
                System.out.print(trav.data +" ");
                trav=trav.next;
            }
        }

    }
    public static void main(String[] args) {
        Stack st =new Stack();
        st.push(8);
        st.push(7);
        st.push(11);
        st.push(13);
        st.display();

    }
}
