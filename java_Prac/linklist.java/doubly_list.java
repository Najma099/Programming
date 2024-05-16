public class doubly_list {
    public static class Node
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
    public static class doubly_linkedlist
    {
        Node head = null;
        Node tail =null;
        int size=0;
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
            size++;
        }
        void addAtLast(int val)
        {
            if(head==null)
            addAtFirst(val);
            else
            {
            Node newNode = new Node(val);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            }
            size++;
        }
        void add(int index, int val)
        {
            Node trav=head;
            Node newNode= new Node(val);
            if(index<0 || index>size)
                throw new IndexOutOfBoundsException("Index out of bound");
            else if(index==0)
                addAtFirst(val);
            else if(index==size)
                addAtLast(val);
            else if(index>0 && index<size-1)
            {
                for(int i=1;i<index;i++)
                {
                    trav=trav.next;
                }
                newNode.next=trav.next;
                newNode.prev=trav;
                trav.next.prev=newNode;
                trav.next=newNode;
                size++;
            }
        }
        void delete(int index)
        {
            
            if(index <0 || index >size )
            throw new IndexOutOfBoundsException("Index out of bound");
            if(index==0)
            {
                head=head.next;
                head.prev=null;
            }
            else if(index==size-1)
            {
                Node trav=tail.prev;
                tail=trav;
                trav.next=null;
            }
            else 
            {
                Node trav =head;
                for(int i=1;i<index;i++)
                {
                    trav=trav.next;
                }
                trav.next=trav.next.next;
                //trav.next.prev=trav;
            }
            size--;
        }
        void display()
        {
            Node temp= head;
            while(temp != null)
            {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        doubly_linkedlist dl = new doubly_linkedlist();
        dl.addAtLast(5);
        dl.addAtFirst(2);
        dl.addAtLast(8);
        dl.add(1,9);
        dl.add(2,19);
        dl.display();
        dl.delete(4);
        dl.delete(4);
        dl.display();
        System.out.println(dl.size);
    }
}
