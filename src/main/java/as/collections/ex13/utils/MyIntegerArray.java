package task13.utils;

import java.util.Arrays;

public class MyIntegerArray {

    private Integer[] vector;
    private static final int DEFAULT_CAPACITY = 10;
    private static int actualCapacity;
    private static int size;

    public MyIntegerArray() {
        vector = new Integer[DEFAULT_CAPACITY];
        actualCapacity = DEFAULT_CAPACITY;
    }

    public void add(Integer str) {
        if (size >= actualCapacity) {
            vector = Arrays.copyOf(vector, size + DEFAULT_CAPACITY);
        } else {
            vector[size] = str;
        }
        size++;
    }

    public Integer get(int i) {
        if (i < size)
            return vector[i];
        else throw new IllegalArgumentException();
    }

    public int size() {
        return size;
    }

}
