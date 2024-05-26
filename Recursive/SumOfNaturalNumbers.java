/*to find the sum of first m natural numbers*/
package Recursive;
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=ob.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        
        if(n==1){
         return 1;
    }else{
         return n+sum(n-1);
        }    
    }
    
}

   