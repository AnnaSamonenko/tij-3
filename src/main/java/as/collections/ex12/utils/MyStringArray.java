package as.collections.ex12.utils;

import java.util.Arrays;

public class MyStringArray {

    private String[] vector;
    private static final int DEFAULT_CAPACITY = 10;
    private static int actualCapacity;
    private static int size;

    public MyStringArray() {
        vector = new String[DEFAULT_CAPACITY];
        actualCapacity = DEFAULT_CAPACITY;
    }

    public void add(String str) {
        if (size >= actualCapacity) {
            vector = Arrays.copyOf(vector, size + DEFAULT_CAPACITY);
        } else {
            vector[size] = str;
        }
        size++;
    }

    public String get(int i) {
        if (i < size)
            return vector[i];
        else throw new IllegalArgumentException();
    }

    public int size() {
        return size;
    }

}
