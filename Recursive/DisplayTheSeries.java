/* to display the series 1,2,3,4,5,6,,8,9,10*/
package Recursive;

public class DisplayTheSeries {
      static void series(int n){
            if(n<11){
                System.out.print(n+" ");
                series(n+1);
            }
        }

    public static void main(String[] args) {
        series(1);
        
    }
    
}
