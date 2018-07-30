package as.interfaces_and_inner_classes.ex11.util2;

import as.interfaces_and_inner_classes.ex11.util1.Interface1;

/**
 * Create an interface with at least one method, in its own package. Create a class in a separate package.
 * Add a protected inner class that implements the interface.
 * In a third package, inherit from your class and, inside a method,
 * return an object of the protected inner class, upcasting to the interface during the return.
 */

public class Class1 {

    protected class InnerClass implements Interface1 {

        public InnerClass() {
        }

        @Override
        public void method() {
            System.out.println("method()");
        }
    }

}
