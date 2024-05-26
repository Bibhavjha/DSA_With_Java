
package Recursive;
import java.util.*;
public class nthtermOfFibonacci {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
         System.out.println("Enter the value of n");
        int n=ob.nextInt();
       
        System.out.println(fibo(n));
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
