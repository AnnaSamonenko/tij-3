package as.collections.ex1;

import as.collections.ex1.util.Arrays2;

/**
 * Create an array of double and fill( ) it using RandDoubleGenerator. Print the results.
 */

public class Main {
    public static void main(String[] args) {
        int size = 6;
        double[] d = new double[size];
        Arrays2.fill(d, new Arrays2.RandDoubleGenerator());
        System.out.print(Arrays2.toString(d));
    }

}
