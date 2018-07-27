package as.collections.ex7;

import as.collections.ex7.util.Mouse;
import as.collections.ex7.util.MouseList;

/**
 * Modify MouseList.java so that it inherits from ArrayList instead of using composition.
 * Demonstrate the problem with this approach.
 */

public class Main {
    public static void main(String[] args) {
        MouseList mouseList = new MouseList();
        Mouse mouse5 = new Mouse(5);
        Mouse mouse2 = new Mouse(2);
        mouseList.addMouse(mouse2);
        mouseList.addMouse(mouse5);
    }
}