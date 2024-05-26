/*multiplication of two numbers*/
package Recursive;

public class MultiplicationofNumber {
    public static void main(String[] args) {
        System.out.println(multiply(5,4));
    }
   static int multiply(int a ,int b){
       if(b==1)
           return a;
       else
           return a+multiply(a,b-1);
   } 

}
