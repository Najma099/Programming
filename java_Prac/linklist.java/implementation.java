//Singly linked 
public class implementation {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class linklist
    {
        Node head=null;
        Node tail=null;
        void insert(int index,int val)
        {
            Node newNode = new Node(val);
            if(index==0)
            insertAtBegin(val);
            else if(index==length()-1)
            insertAtEnd(val);
            else
            {
            Node temp=head;
            for(int i=1;i<=index-1;i++)
            temp=temp.next;
            newNode.next=temp.next;
            temp.next=newNode;
            }
            
        }
        void insertAtBegin(int val)
        {
            Node newNode = new Node(val);
            if(head==null)
            {
                insertAtEnd(val);
            }
            else
            {
                newNode.next=head;
                head=newNode;
            }
        }
        void insertAtEnd(int val)
        {
            Node newNode = new Node(val);
            if(head == null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
            tail.next=newNode;
            tail=newNode;
            }
        }
        void deleteAt(int index)
        {
            Node trav = head;
            if(index==0)
            {
                head=head.next;
                return;
            }
            for (int i = 0; i < index - 1; i++) 
            {
                trav = trav.next;
            }
        
            if (index == length() - 1) 
            {
                
                tail = trav;
                tail.next = null;
            } 
            else 
            {
                trav.next = trav.next.next;
            }
        }
        int getAt(int index)
        {
            Node trav =head;
            for(int i=1;i<=index;i++)
            {
                trav=trav.next;
            }
            return trav.data;
        }
        void display()
        {
            Node temp =head;
            while(temp != null)
            {
                System.out.print(temp.data + " " );
                temp=temp.next;
            }
        }
        int length()
        {
            Node temp=head;
            int count=0;
            while(temp !=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.display();
        System.out.println();
        System.out.println(ll.length());
        ll.insertAtBegin(6);
        ll.display();
        System.out.println();
        ll.insert(1,77);
        ll.display();
        System.out.println(ll.getAt(3));
    }
}
