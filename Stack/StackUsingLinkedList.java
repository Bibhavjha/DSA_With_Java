
package Stack;
class SLLNode{
    int info;
    SLLNode next;
}
class MyStackL{
    SLLNode top;
public void push(int data){
SLLNode newnode=new SLLNode();
newnode.info=data;
if(top==null){
    top=newnode;
}else{
    newnode.next=top;
    top=newnode;
}
}
public void pop(){
  if(top==null){
      System.out.println("Stack empty");
  }  
  else{
      System.out.println("item removed"+top.info);
      SLLNode temp=top;
      top=top.next;
      temp.next=null;
  }
}
public void view(){
    if(top==null){
        System.out.println("Empty Stack");
    }else{
        SLLNode temp=top;
        while(temp!=null){
            System.out.println(temp.info);
            temp=temp.next;
        }
    }
}
public void peek(){
    if(top==null){
        System.out.println("Empty");
    }else{
        System.out.println("Item At top "+top.info); 
    }
}
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
       MyStackL ob=new MyStackL();
       ob.push(5);
       ob.view();
       ob.push(10);
       ob.push(11);
       ob.pop();
       ob.view();
       ob.peek();
    }
}
