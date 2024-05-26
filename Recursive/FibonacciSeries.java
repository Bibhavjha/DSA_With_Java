/*to display the fibonacci Series*/
package Recursive;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
        System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n){
        if(n==0)
            return 0;
        else if( n==1)
            return 1;
        else 
            return fibo(n-1)+fibo(n-2);
    }
    

    
}
