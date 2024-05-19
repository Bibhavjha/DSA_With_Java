package LinkedList;

class DLLNode{
    int info;
    DLLNode next,previous;
}
class DLL{
    DLLNode first,last;
    public void insertFirst(int data){
        DLLNode newnode=new DLLNode();
        newnode.info=data;
        if(first==null){
             first=newnode;
          last=newnode;
        }else{
            newnode.next=first;
            first.previous=newnode;
            first=newnode;
        }
    }
    public void insertLast(int data){
        DLLNode newnode=new DLLNode();
            newnode.info=data;
        if(first==null){
          first=newnode;
          last=newnode;
        }else{
            last.next=newnode;
            newnode.previous=last;
            
            last=newnode;  
        }   
    }
    public void deleteFirst(){
        if(first==null){
            System.out.println("Empty list");
        }else if(first==last){
            first=null;
            last=null;
        }else{
            DLLNode temp=first;
            first=first.next;
            first.previous=null;
            temp.next=null;
        }

    }
    public void deleteLast(){
         if(first==null){
            System.out.println("Empty list");
        }else if(first==last){
        first=null;
        last=null;
    }else{
            DLLNode temp=last.previous;
            last.previous=null;
            last=temp;
            last.next=null;
        }
    }
    public void insertAt(int data, int pos){
        DLLNode newnode=new DLLNode();
        newnode.info=data;
        if(first==null){
            first=newnode;
            last=newnode;
        }else{
            ///find the previous node of given position
            DLLNode temp=first;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            newnode.previous=temp;
            newnode.next.previous=newnode;
        }
    }
     public void display(){
        if(first==null){
            System.out.println("Empty list");
        }else{
            DLLNode temp=first;
            while(temp!=null){
                System.out.print(temp.info+" ");
                temp=temp.next;//to dipslay of the values of doubly linked list
            }
            System.out.println();
        }
    }
      public void deleteAt(int data, int pos){
        if(first==null){
            System.out.println("Empty list");
        }else if(first==last){
        first=null;
        last=null;
        }else{
            ///find the previous node of given position
            DLLNode temp=first;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            DLLNode cur=temp.next;
            temp.next=cur.next;
            cur.next.previous=temp;
            cur.next=null;
            
            cur.previous=null;
        }
    }    

      
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL mylist=new DLL();
        mylist.insertFirst(5);
        mylist.insertFirst(6);
        mylist.display();
        mylist.insertLast(8);
        mylist.insertLast(9);
        mylist.display();
        mylist.deleteFirst();
        mylist.display();
        mylist.deleteLast();
        mylist.display();
        mylist.insertAt(50,2);
        mylist.display();
        mylist.deleteAt(50,2);
        mylist.display();
                
    }
    
}
