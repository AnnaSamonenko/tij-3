package as.collections.ex7.util;

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
