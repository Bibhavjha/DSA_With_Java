
package Sorting;

public class QuickSort {
    static int partition(int a[], int l, int h){
    
        int pivot=a[l];
        int i=l, j=h;
        while(i<j){
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i<j){//swap pivot(a[i] and a[j])
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }//swap pivot(a[l] and a[j])
        int temp=a[l];
        a[l]=a[j];
        a[j]=temp;
        return j;
    }
    static void quicksort(int a[], int l, int h){
        if(l<h){
            int j=partition(a,l,h);
            quicksort(a,l,j);
            quicksort(a,j+1,h);
        }
}
    public static void main(String[] args) {
        int a[]={25,57,48,37,12,92,86,33,Integer.MAX_VALUE};
        quicksort(a,0,a.length-1);
        System.out.println("Elements after sorting");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
   
}
