package as.detecting_types.ex15;

/**
 * Modify the regular expression in ShowMethods.java to additionally strip off
 * the keywords native and final (hint: use the “or” operator ‘|’)
 */

import java.lang.reflect.*;

public class ShowMethods {

    public static void main(String args[]) {
        try {
            Class c = Class.forName("as.detecting_types.ex15.ShowMethods");
            Method[] m = c.getMethods();

            for (int i = 0; i < m.length; i++) {
                if (Modifier.isFinal(m[i].getModifiers()) || Modifier.isNative(m[i].getModifiers()))
                    continue;
                System.out.println(m[i].toString());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}