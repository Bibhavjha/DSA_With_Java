
package Stack;
import java.util.*;

public class PostFixEvaulation {
    public static void main(String[] args) {
        String exp="6 2 3 + - 3 8 2 / + * 2 $ 3 + ";
        Scanner sc =new Scanner(exp);
        java.util.Stack<Integer> opndstk=new Stack<Integer>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                opndstk.push(sc.nextInt());
            }else{
                int op2=opndstk.pop();
                int op1=opndstk.pop( );
                String operator=sc.next();
                switch(operator){
                    case "+":       
                        int value=op1+op2;
                        opndstk.push(value);
                        break;
                    case "-":
                        int value1=op1-op2;
                        opndstk.push(value1);
                        break;
                    case "*":
                        int value2=op1*op2;
                        opndstk.push(value2);
                        break;
                    case "/":
                        int value3=op1/op2;
                        opndstk.push(value3);
                        break;
                    case "$":
                        int value4=(int)Math.pow(op1,op2);
                        opndstk.push(value4);
                        break;
                }
                
                
            }
           
                }
        System.out.println("result= "+opndstk.pop());
    } 
    
}
