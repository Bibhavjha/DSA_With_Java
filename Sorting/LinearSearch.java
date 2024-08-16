
package Sorting;
import java.util.*;
public class LinearSearch {
    static int linearSearch(int a[], int key){
        int i=0, j=a.length;
        while(i<j){
            if(key==a[i])
                return i;
            else
                i++;   
        }
        return -1; //NOT FOUND
    }
    public static void main(String[] args) {
        int a[]={2,3,1,5,7,6,4};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value to search");
        int key=sc.nextInt();
        int result=linearSearch(a,key);
        if(result==-1)
            System.out.println("Item not found");
        else
            System.out.println("item found at  "+result);
        
    }
    
}
