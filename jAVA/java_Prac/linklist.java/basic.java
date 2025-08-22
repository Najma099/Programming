
public class basic {
    public static int count(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void displayr(Node head)
    {
        Node temp=head;
        if(temp == null) return;
        else
        {
            displayr(temp.next);
            System.out.print(temp.data +" ");
        }
    }
    public static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(9);
        Node c= new Node(6);
        Node d= new Node(4);
        Node e= new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // displaying a linklist
        // Node temp = a;
        // while(temp !=null)
        // {
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }

        display(a);
        displayr(a);
        System.out.println();
        System.out.println(count(a));
    }
}
