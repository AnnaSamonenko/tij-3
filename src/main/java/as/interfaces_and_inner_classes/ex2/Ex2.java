package as.interfaces_and_inner_classes.ex2;

import as.interfaces_and_inner_classes.ex2.util.ITest;

/**
 * Create an interface containing three methods, in its own package.
 * Implement the interface in a different package. Prove that all the methods in an interface are automatically public.
 */

public class Ex2 implements ITest {

    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }

    @Override
    public void test3() {
        System.out.println("test3");
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.test1();
        ex2.test2();
        ex2.test3();
    }

}
