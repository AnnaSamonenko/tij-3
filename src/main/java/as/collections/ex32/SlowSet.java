package task32;

import java.util.*;

public class SlowSet extends AbstractSet {

    private SlowMap slowMap = new SlowMap();
    private static final Object PRESENT = new Object();

    @Override
    public boolean add(Object o) {
        return slowMap.put(o, PRESENT) == null;
    }

    @Override
    public int size() {
        return slowMap.size();
    }

    @Override
    public Iterator iterator() {
        return slowMap.keySet().iterator();
    }
}
