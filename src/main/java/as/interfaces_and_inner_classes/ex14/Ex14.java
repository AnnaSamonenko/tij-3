package as.interfaces_and_inner_classes.ex14;

/**
 * Repeat Exercise 12 using an anonymous inner class.
 */

public class Ex14 {

    public static void main(String[] args) {
        Ex14 ex14 = new Ex14();
        ex14.methodWithInnerClass().method();
    }

    public IFirst methodWithInnerClass() {
        return new IFirst() {
            @Override
            public void method() {
                System.out.println("baida");
            }
        };
    }
}
