package LinkedList;

import java.util.*;
public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList mylist=new ArrayList();
        mylist.add("ram");
        System.out.println(mylist);
        mylist.add("sita");
        System.out.println(mylist);
        mylist.add(1,"hari");
        System.out.println(mylist);
        mylist.remove(0);
        System.out.println(mylist);
     //remove(object o )doesnt work on integer)
     mylist.remove("hari");
        System.out.println(mylist);
    }
    
}
