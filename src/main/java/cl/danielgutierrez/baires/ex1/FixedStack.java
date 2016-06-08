package cl.danielgutierrez.baires.ex1;

/**
 * Created by Daniel on 08-06-2016.
 */
public class FixedStack {

    private final int[] elements;
    private int size = 0;

    public FixedStack(int n) {
        this.elements = new int[n];
    }

    public void push(Integer n) {
        this.elements[this.size++] = n;
    }

    public int pop() {
        //if (size == 0) throw new RuntimeException("not more elements");
        return this.elements[--this.size];
    }

    public boolean isNotEmpty() {
        return 0 != size;
    }



}