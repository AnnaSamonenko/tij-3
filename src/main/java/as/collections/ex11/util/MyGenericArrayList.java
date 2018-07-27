package task11.util;

import java.util.ArrayList;
import java.util.List;

public class MyGenericArrayList {

    private List list;

    public MyGenericArrayList() {
        list = new ArrayList();
    }

    public void add(Object el) {
        if (list.isEmpty()) {
            list.add(el);
        } else {
            if (verifyClass(el)) {
                list.add(el);
            } else throw new IllegalArgumentException();
        }
    }

    private boolean verifyClass(Object el) {
        return el.getClass().equals(list.get(0).getClass());
    }

}
