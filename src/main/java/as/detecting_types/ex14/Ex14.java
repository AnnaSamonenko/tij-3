package as.detecting_types.ex14;

/**
 * Look up the interface for java.lang.Class in the JDK documentation from java.sun.com.
 * Write a program that takes the name of a class as a command-line argument,
 * then uses the Class methods to dump all the information available for that class.
 * Test your program with a standard library class and a class you create.
 */

public class Ex14 {

    private static final String className = "as.detecting_types.ex12.Shape";

    public static void main(String[] args) {
        MyClass myClass = new MyClass(className);
        myClass.printClassFields();
        myClass.printClassMethods();
        myClass.printParentClass();
        myClass.printInterfaces();

    }
}
