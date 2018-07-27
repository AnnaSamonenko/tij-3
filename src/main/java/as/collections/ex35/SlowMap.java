package task35;

import task32.MPair;

import java.util.*;

public class SlowMap implements Map {

    private List
            keys = new ArrayList(),
            values = new ArrayList();

    public Object put(Object key, Object value) {
        Object result = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return result;
    }

    public Object get(Object key) {
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

    public Set entrySet() {
        Set entries = new HashSet();
        Iterator
                ki = keys.iterator(),
                vi = values.iterator();
        while (ki.hasNext())
            entries.add(new MPair(ki.next(), vi.next()));
        return entries;
    }

    public String toString() {
        StringBuffer s = new StringBuffer("{");
        Iterator
                ki = keys.iterator(),
                vi = values.iterator();
        while (ki.hasNext()) {
            s.append(ki.next() + "=" + vi.next());
            if (ki.hasNext()) s.append(", ");
        }
        s.append("}");
        return s.toString();
    }

    @Override
    public int size() {
        return keySet().size();
    }

    @Override
    public boolean isEmpty() {
        return keySet().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return keySet().contains(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override
    public Object remove(Object key) {
        values.remove(keys.indexOf(key));
        return keys.remove(key);
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {
        values.clear();
        keys.clear();
    }

    @Override
    public Set keySet() {
        return new HashSet(keys);
    }

    @Override
    public Collection values() {
        return values;
    }
}
