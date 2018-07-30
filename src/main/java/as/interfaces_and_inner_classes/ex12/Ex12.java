package as.interfaces_and_inner_classes.ex12;

/**
 * Create an interface with at least one method, and implement that interface by defining
 * an inner class within a method, which returns a reference to your interface.
 */

public class Ex12 {

    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        ex12.methodWithInnerClass().method();
    }

    public IFirst methodWithInnerClass() {
        class LocalClass implements IFirst {
            @Override
            public void method() {
                System.out.println("baida");
            }
        }
        return (IFirst) new LocalClass();
    }
}
