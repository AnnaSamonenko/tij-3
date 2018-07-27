package task6.util;

//: c11:MouseList.java
// A type-conscious List.

import java.util.ArrayList;
import java.util.List;

public class MouseList {
    private List list = new ArrayList();

    public void add(Mouse m) {
        list.add(m);
    }

    public Mouse get(int index) {
        return (Mouse) list.get(index);
    }

    public int size() {
        return list.size();
    }
}
