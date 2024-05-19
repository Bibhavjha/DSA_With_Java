package LinkedList;

import java.util.*;
public class UsingLinkedList {
    public static void main(String[] args) {
        LinkedList MyList=new LinkedList();
        MyList.addFirst(20);
        MyList.addFirst(10);
        System.out.println(MyList);
        MyList.addLast(30);
        System.out.println(MyList);
        MyList.add(2,25);
        System.out.println(MyList);
        MyList.removeFirst();
        System.out.println(MyList);
        MyList.removeLast();
        System.out.println(MyList);
        MyList.remove(1);
        System.out.println(MyList);
        
    }
    
}
