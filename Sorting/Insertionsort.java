
package Sorting;

public class Insertionsort {
   static void insertionsort(int a[]){
       int n=a.length;
       for(int i=1;i<n;i++){
           int key=a[i];
           int j=i-1;
           while(j>=0&&a[j]>key){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=key;
       }
   }
    public static void main(String[] args) {
        int a[]={8,10,9,3,4,7,5,6};
        insertionsort(a);
        System.out.println("After sorting");
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
      }
    }
}
