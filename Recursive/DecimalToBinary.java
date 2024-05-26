/* convert decimal to binary*/
package Recursive;

public class DecimalToBinary {
    public static void main(String[] args) {
        dtob(5);
    }
    static void dtob(int n){
        if(n==0)
            return;
        else{
    dtob(n/2);
            System.out.print(n%2);
        }
}
}
