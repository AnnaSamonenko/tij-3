package task7.util;

//: c11:MouseList.java
// A type-conscious List.

import java.util.ArrayList;
import java.util.List;

public class MouseList extends ArrayList {

    public void addMouse(Mouse m) {
        add(m);
    }

    public Mouse getMouse(int index) {
        return (Mouse) get(index);
    }

    public int sizeOfMouse() {
        return size();
    }
}
