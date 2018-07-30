package as.detecting_types.ex14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyClass {

    private Class clazz;

    public MyClass(String className) {
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printClassMethods() {
        System.out.println("Class methods: ");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method.toString());
    }

    public void printClassFields() {
        System.out.println("Class field: ");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.print(field.getName());
    }

    public void printParentClass() {
        System.out.println("Parent class: ");
        Class parentClasses = clazz.getSuperclass();
        System.out.print(parentClasses);

    }

    public void printInterfaces() {
        System.out.print("Interfaces: ");
        Class[] interfaces = clazz.getInterfaces();
        for (Class interf : interfaces)
            System.out.println(interf.toString());
    }
}
