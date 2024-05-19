package LinkedList;

class CLLNode{
    int info;
    CLLNode next;
}
class CLL{
    CLLNode first;
    CLLNode last;
    
    public void insertFirst(int data){
      CLLNode newnode=new CLLNode();
      newnode.info=data;
      if(first==null){
          first=newnode;
          last=newnode;
          last.next=first;
      }else{
          newnode.next=first;
          first=newnode;
          last.next=first;
      }
    }
    public void insertLast(int data){
        CLLNode newnode=new CLLNode();
        newnode.info=data;
        if(first==null){
          first=newnode;
          last=newnode;
      }else{
            last.next=newnode;
            last=newnode;
            last.next=first;
        }
        
    }
    public void deleteFirst(){
        if(first==null){
            System.out.println("Empty list");
        }else if(first==last){
            first=null;
            last=null;
        }else{
            CLLNode temp=first;
            first=first.next;
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
            CLLNode temp=first;
            while(temp.next!=last){
                temp=temp.next;
            }
           last.next=null;
           temp.next=first;
           last=temp;
        }
    }
    public void insertAt(int data, int pos){
        CLLNode newnode=new CLLNode();
        newnode.info=data;
        if(first==null){
            first=newnode;
            last=newnode;
        }else{
            ///find the previous node of given position
            CLLNode temp=first;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
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
            CLLNode temp=first;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            CLLNode cur=temp.next;
            temp.next=cur.next;
            cur.next=null;
        }
    }    

    public void display(){
        if(first==null){
            System.out.println("Empty list");
        }else{
            CLLNode temp=first;
            while(temp!=last){
                System.out.print(temp.info+" ");
                temp=temp.next;//to dipslay of the values of singly linked list
            }
            System.out.println(temp.info);
        }
    }
    
}
public class CircularlyLinkedList {
    public static void main(String[] args) {
        CLL mylist=new CLL();
        mylist.insertFirst(5);
        mylist.insertFirst(6);
        mylist.display();
        mylist.insertLast(8);
        mylist.insertLast(9);
        mylist.display();
        mylist.deleteLast();
        mylist.display();
        mylist.insertAt(50,2);
        mylist.display();
        mylist.deleteAt(50,2);
        mylist.display();
    }
    
}
