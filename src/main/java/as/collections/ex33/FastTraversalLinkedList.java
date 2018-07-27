package task33;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FastTraversalLinkedList extends AbstractList {

    private List lList = new LinkedList();
    private List aList = new ArrayList();

    private boolean changed;

    @Override
    public boolean add(Object o) {
        changed = true;
        return lList.add(o);
    }

    @Override
    public Object remove(int index) {
        return lList.remove(index);
    }

    @Override
    public Object get(int index) {
        if (changed)
            update();
        return aList.get(index);
    }

    @Override
    public int size() {
        return lList.size();
    }

    private void update() {
        aList = new ArrayList(lList);
        changed = false;
    }
}
