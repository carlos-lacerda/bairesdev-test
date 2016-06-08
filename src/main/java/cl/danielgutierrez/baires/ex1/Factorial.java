package cl.danielgutierrez.baires.ex1;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * @author daniel.gutierrez
 */
public class Factorial{

    private final int num;
    private final int value;

    public Factorial(int n) {
        this.num = n;
        this.value = fixedStackImpl(n);
    }

    public static int fixedStackImpl(int n){
        FixedStack stack = new FixedStack(n);
        int factorial = 1;
        while(stack.isNotEmpty()) {
            factorial *= stack.pop();
        }
        return factorial;
    }


    @Override
    public String toString() {
        return "Factorial of "+this.num+" is "+this.value;
    }

    public int getValue() {
        return value;
    }


    //another implementations

    @Deprecated
    public static int stackImpl(int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int i = 1;
        while(++i<=n){
            stack.push(stack.pop()*i);
        }
        return stack.pop();
    }

    @Deprecated
    public static int arrayDequeueImpl(int n){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(n>1) stack.push(n--);
        int factorial = 1;
        while(!stack.isEmpty()){
            factorial *= stack.pop();
        }
        return factorial;
    }



    @Deprecated
    public static int simpleImpl(int n){
        int result = 1;
        while(n > 1){
            result *= n--;
        }
        return result;
    }

    @Deprecated
    public static int recursiveImpl(int n){
        return n > 1 ? recursiveImpl(n-1)*n : 1;
    }








}
