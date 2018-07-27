package as.collections.ex24;

import java.util.LinkedList;

public class Deque {

    private LinkedList list = new LinkedList();

    public void putFirst(Object v) {
        list.addFirst(v);
    }

    public Object getLast() {
        return list.removeLast();
    }

    public void putLast(Object v) {
        list.addLast(v);
    }

    public Object getFirst() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Object[] toArray() {
        return list.toArray();
    }

}
