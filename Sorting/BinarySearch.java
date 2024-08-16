
package Sorting;
import java.util.*;
public class BinarySearch {
    static int binarysearch(int a[], int key, int l, int h){
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key)
                return mid;
            
                if(a[mid]<key)
                    l=mid+1;
            else
                    h=mid-1;
        }
        return-1;//not found
    }
    public static void main(String[] args) {
         int a[]={1,2,5,7,9,12};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key value");
          int key=sc.nextInt();
          int result=binarysearch(a,key,0,a.length-1);
          if(result==-1){
              System.out.println("Unsuccessful");
          }else{
              System.out.println("key found at "+result);
          }
        
                
    }
}
