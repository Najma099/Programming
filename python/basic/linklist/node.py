class Node:
    def __init__(self,data,prev=None,next=None):
        self.data=data
        self.prev=prev
        self.next=next
    def __str__(self):
        return str(self.data)
node=Node(10)
print(node)
print(node.data)

class DDL:
    def __init__(self):
        self.__head__=None
        self.__tail__=None
        self.__size__=0
    def size(self):
        return self.__size__
    def isEmpty(self):
        return self.size()==0
    def append(self,data):
        newNode=Node(data)
        if self.isEmpty():
            self.__head=newNode
            self.__tail=newNode
            
        else:
            self.__tail__.next=newNode
            newNode.prev=self.__tail
            self.__tail__=newNode

        self.__size__+=1
    
    def __str__(self):
        d=[]
        trav=self.__head
        while trav is not None:
            d.append(trav.data)
            trav=trav.next
        return '<--->'.join(map(str,d))
    
    def addFirst(self,data):
        newNode=Node(data)
        if self.isEmpty():
            self.__head=newNode
            self.__tail=newNode
        else:
            newNode.next=self.__head
            self.__head.prev=newNode
            self.__head=newNode
        self.size+=1
    
    def addAt(index,data):
        if(index<0 or index>self.size()):
            raise Exception("Invalid index")
        if index==0:
            self.addFirst(data)
        
        id=0
        trav=self.__head
        while id!=index-1:
            id+=1
            trav=trav.next
        newNode= Node(data,trav,trav.next)
        trav.next=newNode
        newNode.next.prev=newNode
        size+=1

l= DDL()
print(l.size())
l.append(5)
print(l.size())
print(l)


