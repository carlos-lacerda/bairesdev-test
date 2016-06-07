package cl.danielgutierrez.baires.ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daniel.gutierrez
 */
public class ListProcess{

    private final int[] a;
    private final int[] b;

    private final List<Integer> c = new ArrayList<>();
    private final List<Integer> d = new ArrayList<>();

    public ListProcess(int[] a,int[] b) {
        this.a = a;
        this.b = b;
        process();
    }

    private void process(){
        for(int i=0;i<this.b.length;i++) {
            if (contains(this.a, this.b[i])) {
                //inters
                addIfNotExist(this.c, this.b[i]);
            } else {
                //diff
                addIfNotExist(this.d, this.b[i]);
            }
        }
    }

    private void addIfNotExist(List<Integer> list, int n) {
        if(!list.contains(n)){
            list.add(n);
        }
    }

    private boolean contains(int[] list, int n){
        for(int i : list){
            if(i==n){
                return true;
            }
        }
        return false;
    }

    public List<Integer> getC() {
        return c;
    }

    public List<Integer> getD() {
        return d;
    }


}
