package as.collections.ex14;

import as.collections.ex1.util.Arrays2;

/**
 * Using the utilities in com.bruceeckel.util, create an array of each primitive type and of String,
 * then fill each array by using an appropriate generator,
 * and print each array using the appropriate print( ) method. .
 */
public class Main {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        byte[] byteArr = new byte[SIZE];
        Arrays2.fill(byteArr, new Arrays2.RandByteGenerator());
        System.out.println("byteArr = " + Arrays2.toString(byteArr));

        short[] shortArr = new short[SIZE];
        Arrays2.fill(shortArr, new Arrays2.RandShortGenerator());
        System.out.println("shortArr = " + Arrays2.toString(shortArr));

        int[] intArr = new int[SIZE];
        Arrays2.fill(intArr, new Arrays2.RandIntGenerator());
        System.out.println("intArr = " + Arrays2.toString(intArr));

        long[] longArr = new long[SIZE];
        Arrays2.fill(longArr, new Arrays2.RandLongGenerator());
        System.out.println("longArr = " + Arrays2.toString(longArr));

        char[] charArr = new char[SIZE];
        Arrays2.fill(charArr, new Arrays2.RandCharGenerator());
        System.out.println("charArr = " + Arrays2.toString(charArr));

        boolean[] booleanArr = new boolean[SIZE];
        Arrays2.fill(booleanArr, new Arrays2.RandBooleanGenerator());
        System.out.println("booleanArr = " + Arrays2.toString(booleanArr));

        float[] floatArr = new float[SIZE];
        Arrays2.fill(floatArr, new Arrays2.RandFloatGenerator());
        System.out.println("floatArr = " + Arrays2.toString(floatArr));

        double[] doubleArr = new double[SIZE];
        Arrays2.fill(doubleArr, new Arrays2.RandDoubleGenerator());
        System.out.println("doubleArr = " + Arrays2.toString(doubleArr));

        String[] stringArr = new String[SIZE];
        Arrays2.fill(stringArr, new Arrays2.RandStringGenerator(10));
        System.out.println("stringArr = " + Arrays2.toString(stringArr));
    }

}
