
package Queue;

import java.util.*;
interface Queue{
    void enqueue(int data);
    void dequeue();
    void view();
}
class MyQueue1 implements Queue{
    int QSIZE=5;
    int Queue[]=new int[QSIZE];
    int REAR=-1,FRONT=-1;
    public void enqueue(int data){
        if(REAR==QSIZE-1&&FRONT==0){
            System.out.println("Queue Overflow");
        }   
        else{
            if(FRONT==-1)
                FRONT=0;
            REAR=(REAR+1)%QSIZE;
            Queue[REAR]=data;
        }
    }
    public void dequeue(){
      if(FRONT==-1){
          System.out.println("UnderFlow");
      }  
      else {
          System.out.println("Item delated"+Queue[FRONT]);
          Queue[FRONT]=0;//optional 
          FRONT++;
      }
    }
    public void view(){
        if(FRONT==-1){
            System.out.println("QUEUE empty");
        }else{
            if(REAR>=FRONT){
        for(int i=FRONT;i<=REAR;i++){
            System.out.print(Queue[i]+" ");
        }
            }else{
            
                for(int i=FRONT;i<QSIZE;i++){
                    System.out.print(Queue[i]+" ");
                }
                for(int i=0;i<=REAR;i++){
                    System.out.print(Queue[i]+" ");
                }
            }
        
    }
        System.out.println();
}
}
public class CircularyQueueUsingArray {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        MyQueue1 ob=new MyQueue1();
         ob.enqueue(8);
        ob.enqueue(7);
        ob.enqueue(10);
        ob.view();
        ob.dequeue();
        ob.view();
       /* while(true){
        System.out.println("1.enqueue\n2.dequeue\n3.view");
        System.out.println("4.Exit\n enter your choice:");
        
       
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter a value to insert");
                int val=sc.nextInt();
                        ob.enqueue(val);
                        break;
            case 2:
                ob.dequeue();
                break;
            case 3:
                ob.view();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    */
}
}

