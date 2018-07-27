package as.detecting_types.task7;

/**
 * Modify Exercise 6 so that it uses Class.getDeclaredFields( ) to also display information about the fields in a class.
 */

class A {
}

class B extends A {
}

class C extends B {
}

public class ObjectHierarchyWithFields {

    public static void main(String[] args) {
        printClassHierachy(C.class);
    }

    static void printClassHierachy(Class clazz) {
        if (clazz.getSuperclass().equals(Object.class))
            return;
        printClassHierachy(clazz.getSuperclass());
        System.out.println(clazz.getSuperclass());
    }

}
