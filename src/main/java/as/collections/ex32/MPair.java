package as.collections.ex32;

import java.util.*;

public class MPair implements Map.Entry, Comparable {
    private Object key, value;

    public MPair(Object k, Object v) {
        key = k;
        value = v;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(Object v) {
        Object result = value;
        value = v;
        return result;
    }

    public boolean equals(Object o) {
        return key.equals(((MPair) o).key);
    }

    public int compareTo(Object rv) {
        return ((Comparable) key).compareTo(((MPair) rv).key);
    }

    @Override
    public String toString() {
        return "MPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
