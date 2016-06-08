package cl.danielgutierrez.baires.ex1;

/**
 * Created by Daniel on 08-06-2016.
 */
public class FixedStack {

    private int[] elements;
    private int size;

    public FixedStack(int n) {
        this.allocateElements(n);
        while(n>1) this.push(n--);
    }

    public void push(Integer n) {
        this.elements[this.size] = n;
        this.size = (this.size + 1) & (this.elements.length - 1);
    }

    public int pop() {
        //if (size == 0) throw new RuntimeException("not more elements");
        int last = (size - 1) & (this.elements.length - 1);
        this.size = last;
        return this.elements[last];
    }

    public boolean isNotEmpty() {
        return 0 != size;
    }

    //stolen method from java.util.ArrayDequeu
    private void allocateElements(int numElements) {
        int initialCapacity = numElements;
        initialCapacity |= (initialCapacity >>>  1);
        initialCapacity |= (initialCapacity >>>  2);
        initialCapacity |= (initialCapacity >>>  4);
        initialCapacity |= (initialCapacity >>>  8);
        initialCapacity |= (initialCapacity >>> 16);
        initialCapacity++;

        if (initialCapacity < 0)   // Too many elements, must back off
            initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements

        this.elements = new int[initialCapacity];
    }


}