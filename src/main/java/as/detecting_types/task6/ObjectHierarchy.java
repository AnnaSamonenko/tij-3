package as.detecting_types.task6;

/**
 * Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.
 */

class A {
}

class B extends A {
}

class C extends B {
}

public class ObjectHierarchy {


    public static void main(String[] args) {
        printClassHierarchy(C.class);
    }

    static void printClassHierarchy(Class clazz) {
        if (clazz.getSuperclass().equals(Object.class))
            return;
        printClassHierarchy(clazz.getSuperclass());
        System.out.println(clazz.getSuperclass());
    }

}
