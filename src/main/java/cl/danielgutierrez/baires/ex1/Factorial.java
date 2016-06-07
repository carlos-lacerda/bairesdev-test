package cl.danielgutierrez.baires.ex1;

import java.util.Stack;

/**
 * @author daniel.gutierrez
 */
public class Factorial{

    private final int num;
    private final int value;

    public Factorial(int n) {
        this.num = n;
        this.value = factorialWithStack(n);
    }

    @Override
    public String toString() {
        return "Factorial of "+this.num+" is "+this.value;
    }

    public int getValue() {
        return value;
    }

    public static int factorialWithStack(int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int i = 1;
        while(++i<=n){
            stack.push(stack.pop()*i);
        }
        return stack.pop();
    }

    @Deprecated
    public static int getFactorial(int n){
        int result = 1;
        while(n > 0){
            result *= n--;
        }
        return result;
    }

    @Deprecated
    public static int recursiveFactorial(int n){
        return n > 1 ? recursiveFactorial(n-1)*n : 1;
    }



}
