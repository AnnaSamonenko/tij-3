package as.detecting_types.ex7;

import java.lang.reflect.Field;

/**
 * Modify Exercise 6 so that it uses Class.getDeclaredFields( ) to also display information about the fields in a class.
 */

class A {
    public String a = "A field";
}

class B extends A {
    public String b = "B field";
}

class C extends B {
    public String c1 = "C field";
    public String c2;
}

public class ObjectHierarchyWithFields {

    public static void main(String[] args) {
        printClassHierarchy(C.class);
    }

    static void printClassHierarchy(Class clazz) {
        printClassFields(clazz);
        if (clazz.getSuperclass().equals(Object.class))
            return;
        printClassHierarchy(clazz.getSuperclass());
    }

    static void printClassFields(Class clazz) {
        System.out.print("Declared fields for " + clazz + ": ");
        Field[] field = clazz.getDeclaredFields();
        for (int i = 0; i < field.length; i++)
            System.out.print(field[i].getName() + " ");
        System.out.println();
    }

}
