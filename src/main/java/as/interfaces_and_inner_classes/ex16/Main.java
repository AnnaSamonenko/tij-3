package as.interfaces_and_inner_classes.ex16;

/**
 * Create a private inner class that implements a public interface. Write a method that returns a reference
 * to an instance of the private inner class, upcast to the interface.
 * Show that the inner class is completely hidden by trying to downcast to it.
 */

public class Main {

    public static void main(String[] args) {
        CFirst cFirst = new CFirst();
        cFirst.getInnerClass().method();
        //! CFirst.InnerClass in = (CFirst.InnerClass) cFirst.getInnerClass(); -- InnerClass is not visible
    }

}
