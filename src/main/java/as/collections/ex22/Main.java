package as.collections.ex22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a class, then make an initialized array of objects of your class. Fill a List from your array.
 * Create a subset of your List by using subList( ), then remove this subset from your List by using removeAll( ).
 */

public class Main {

    public static void main(String[] args) {
        Test[] array = new Test[10];
        for (int i = 0; i < array.length; i++)
            array[i] = new Test(i);

        List<Test> arrayList = new ArrayList(Arrays.asList(array));

        List sublist = arrayList.subList(2, 5);
        arrayList.removeAll(sublist);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).getA() + " ");
        }

    }

}
