package as.collections.ex11;

import as.collections.ex11.util.MyGenericArrayList;

/**
 * Create a new type of container that uses a private ArrayList to hold the objects.
 * Using a Class reference, capture the type of the first object you put in it,
 * and then allow the user to insert objects of only that type from then on.
 */
public class Main {

    public static void main(String[] args) {
        MyGenericArrayList list = new MyGenericArrayList();
        list.add(5);
        list.add(6);
        list.add(58);
    }
}
