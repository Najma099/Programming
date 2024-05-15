public class doubly_list {
    public static Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static doubly_linkedlist
    {
        Node head = null;
        Node tail =null;
        void addAtFirst(int val)
        {
            Node newNode = new Node(val);
            if(head == null)
            {
                head= newNode;
                tail= newNode;
            }
            else
            {
                newNode.next =head;
                head.prev= newNode;
                head=newNode;
            }
        }
    }
    public static void main(String[] args)
    {
        doubly_linkedlist dl = new doubly_linkedlist();
        dl.addAtFirst(2);
    }
}
