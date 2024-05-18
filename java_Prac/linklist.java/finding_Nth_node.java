
public class finding_Nth_node {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        

    }
    public static Node NthEle(Node head ,int n)
        {
            Node Fast=head;
            Node Slow=head;
            for(int i=1;i<=n;i++)
            {
                Fast=Fast.next;
            }
            while(Fast !=null)
            {
                Fast=Fast.next;
                Slow=Slow.next;
            }
            return Slow;
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
        //find 2nd last element
        Node ans=NthEle(a,2);
        System.out.print(ans.data);
    }
}
