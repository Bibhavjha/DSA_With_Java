
package Sorting;

public class SelectionSort {
    static void selectionSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
         int a[]={5,8,4,7,3};
      selectionSort(a);
      System.out.println("After sorting");
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
      }
    }

    }
