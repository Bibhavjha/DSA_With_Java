package Stack;

import java.util.*;
interface stack{
public void push(int data);
public int pop();
public int peek();
public void view();
}
class mystack implements stack{
    int Top=-1,STACKSIZE=5,item;
    int stack[]=new int[STACKSIZE];
    public void push(int data){
        if(Top==STACKSIZE-1){
            System.out.println("Satck Overflow");
        }else{
            Top++;
            stack[Top]=data;
        }
    }
    public int pop(){
        if(Top==-1){
            System.out.println("Stack underflow");
        }else{
             item=stack[Top];
            Top--;
            
        }
        return item;
    }
    public int peek(){
         if(Top==-1){
            System.out.println("Stack underflow");
        }else{
             item=stack[Top];
        }
        return item;
    }
    public void view(){
        if (Top==-1){
            System.out.println("Empty Stack");
        }else{
            for(int i=Top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
      
         mystack ob=new mystack();
           //make it using switch
       /* Scanner in=new Scanner(System.in);
        while(true){
        System.out.println("Enter your choice");
        System.out.println("1.For Push");
        System.out.println("2. for POP ");
        System.out.println("3.for peek");
            System.out.println("4. for view");
        int n=in.nextInt();
        switch(n){
                case 1:
                    System.out.println("enter a value");
                    int val=in.nextInt();*/
       /*break;
                case 2:
        System.out.println("Item removed:"+ob.pop());
        
        break;
                case 3:*/
        
       // System.out.println("value at Top:"+ob.peek());
        
                /*case 4:
                   
        break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");*/
               
        //ob.push(10);
        ob.push(10);
        ob.push(15);
        ob.view();
        //ob.push(50);
        //ob.view();
        ob.push(45);
        ob.push(64);
        ob.push(14);
        ob.view();
        ob.pop();
        ob.push(5);
        ob.peek();
        
        }
        }
    /*}
}
*/
    

