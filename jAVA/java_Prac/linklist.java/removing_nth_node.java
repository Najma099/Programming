
public class removing_nth_node {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
       

    }
    public static void display(Node head)
    {
        Node trav =head;
        while(trav != null)
        {
            System.out.print(trav.data +" ");
            trav=trav.next;
        }
        System.out.println();
    }
    //removing nth node from last
    public static Node removing_n_node(Node head ,int n)
      {
       
        Node fast=head;
        Node slow=head;
        
        for(int i=1;i<=n ;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
        }
        else
        {
        while(fast.next != null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        }
        return head;
       
      } 
    public static void main(String[] args) {
        Node a = new Node (6);
        Node b = new Node (8);
        Node c = new Node (5);
        Node d = new Node (3);
        Node e = new Node (4);
        Node f = new Node (22);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        removing_n_node(a, 1);
        display(a);
        a=removing_n_node(a, 5);
        display(a);
    }
}
