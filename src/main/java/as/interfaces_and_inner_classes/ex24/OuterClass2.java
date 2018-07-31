package as.interfaces_and_inner_classes.ex24;

public class OuterClass2 {

    class InnerClass extends OuterClass.InnerClass {
        // necessary to explicitly put reference to the outer class
        InnerClass(OuterClass x, int num) {
            x.super(num);
        }
    }

}
