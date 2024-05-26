/* to find the factorial of a number*/
package Recursive;

public class FactorialNumber {
    
    public static void main(String[] args) {
        System.out.println(fact(5));   
    }
static int fact(int n) {
    if(n==1)
        return 1;
    else
        return n*fact(n-1);
    
}   
    

    
}
