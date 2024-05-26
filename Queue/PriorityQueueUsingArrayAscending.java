
package Queue;

interface Queue2{
    void enqueue(int data);
    void dequeue();
    void view();
}
class MyQueue2 implements Queue2{
    int QSIZE=5;
    int Queue[]=new int[QSIZE];
    int REAR=-1,FRONT=-1;
    public void enqueue(int data){
        if(REAR==QSIZE-1){
            System.out.println("Queue Overflow");
        }   
        else if(REAR==-1){
            REAR++;
        Queue[REAR]=data;
        FRONT=0;
    }else{
          REAR++;
        Queue[REAR]=data;  
        
        }
    }
    public void dequeue(){
      if(FRONT==-1){
          System.out.println("UnderFlow");
      }  
      else {
          //find the smallest value and its index
          int small=Queue[FRONT];
          int index=FRONT;
          for(int i=FRONT;i<=REAR;i++){
              if(Queue[i]<small){//if(Queue[i]>small)descending
                  small=Queue[i];
                  index=i;
              }
          }
          System.out.println("Item Deleted:"+small);
         //shift the elements one step back
         for(int i=index;i<=REAR;i++){
             Queue[i]=Queue[i+1];
         }
         REAR--;
      }
    }
    public void view(){
        if(FRONT==-1){
            System.out.println("QUEUE empty");
        }
        for(int i=FRONT;i<=REAR;i++){
            System.out.print(Queue[i]+" ");
        }
        System.out.println();
    }
}
public class PriorityQueueUsingArrayAscending {
    public static void main(String[] args) {
        MyQueue2 ob=new MyQueue2();
        ob.enqueue(8);
        ob.enqueue(7);
        ob.enqueue(10);
        ob.view();
        ob.dequeue();
        ob.view();
    }
    
}
