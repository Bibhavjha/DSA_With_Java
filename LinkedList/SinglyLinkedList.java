package LinkedList;

class SLLNode{
    int info;
    SLLNode next;
}
class SLL{
    SLLNode first,last;
    public void insertFirst(int data){
      SLLNode newnode=new SLLNode();
      newnode.info=data;
      if(first==null){
          first=newnode;
          last=newnode;
      }else{
          newnode.next=first;
          first=newnode;
      }
    }
    public void insertLast(int data){
        SLLNode newnode=new SLLNode();
        newnode.info=data;
        if(first==null){
          first=newnode;
          last=newnode;
      }else{
            last.next=newnode;
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
            SLLNode temp=first;
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
            SLLNode temp=first;
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next=null;
            last=temp;
        }
    }
    public void insertAt(int data, int pos){
        SLLNode newnode=new SLLNode();
        newnode.info=data;
        if(first==null){
            first=newnode;
            last=newnode;
        }else{
            ///find the previous node of given position
            SLLNode temp=first;
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
            SLLNode temp=first;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            SLLNode cur=temp.next;
            temp.next=cur.next;
            cur.next=null;
        }
    }   
    //java function to search an item in a SLL
    public void Search(int data){
        boolean isfound=false;
        int x=0;
        if(first==null){
            System.out.println("Empty list");
        }else{
            SLLNode temp=first;
            while(temp!=null){
                x++;
                if(temp.info==data){
                    System.out.println("Search successfull");
                isfound=true;
                System.out.println("Data found at node"+x);
                break;
            }
            temp=temp.next;
        }
        }if(isfound==false){
            System.out.println("data doesn't exist");
        } 
        
    }
    public void display(){
        if(first==null){
            System.out.println("Empty list");
        }else{
            SLLNode temp=first;
            while(temp!=null){
                
                System.out.print(temp.info+" ");
                temp=temp.next;//to dipslay of the values of singly linked list
            }
            System.out.println();
        }
    }
}
//write a java program to print the data of dll in reverse order
public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL mylist=new SLL();
        mylist.insertFirst(5);
        mylist.insertFirst(6);
        mylist.display();
        mylist.insertLast(8);
        mylist.insertLast(9);
        mylist.display();
        mylist.deleteFirst();
        mylist.display();
        mylist.insertAt(50,2);
        mylist.display();
        mylist.deleteAt(50,2);
        mylist.display();
        mylist.Search(8);
        mylist.display();
        mylist.Search(50);
        mylist.display();
        
    }
    
}
