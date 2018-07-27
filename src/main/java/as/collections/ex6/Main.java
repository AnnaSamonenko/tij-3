package task6;

import task6.util.Mouse;
import task6.util.MouseList;

/**
 * Demonstrate that you cant add anything but a Mouse to a MouseList. .
 */
public class Main {
    public static void main(String[] args) {
        MouseList mouseList = new MouseList();
        Mouse mouse = new Mouse(5);
        mouseList.add(mouse);
        //mouseList.add(new Object()); - not possible
    }
}
