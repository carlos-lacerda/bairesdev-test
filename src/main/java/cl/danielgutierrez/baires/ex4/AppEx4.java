package cl.danielgutierrez.baires.ex4;

/**
 * @author daniel.gutierrez
 */
public class AppEx4 {


    /**
     * Given two lists of numbers,
         A = [2, 5, 8, 10]
         B = [2, 2, 3, 4, 4, 20]
         Create two new lists C and D.
         C must contain elements present in A and B
         D must contain elements present in B but not present in A.
         Lists are ordered, can contained repeated elements, and may be of different sizes.

     *
     */
    public static void main(String[] args) {

        final int[] a = {2, 5, 8, 10};
        final int[] b = {2, 2, 3, 4, 4, 20};

        ListProcess listProcess = new ListProcess(a,b);

        System.out.println(listProcess.getC());
        System.out.println(listProcess.getD());
    }






}
