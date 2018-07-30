package as.interfaces_and_inner_classes.ex1;

/**
 * Prove that the fields in an interface are implicitly static and final.
 */

public class Ex1 {

    public static void main(String[] args) {
        // it's possible because I is static
        System.out.println(ITest.I);
        // not possible because I is final(can't change the value)
        //! ITest.I = 8;
    }

}
