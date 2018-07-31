package as.interfaces_and_inner_classes.ex22;

public class OuterClass {

    OuterClass() {
        System.out.println("OuterClass: constructor");
    }

    class InnerClass1 {

        InnerClass1() {
            System.out.println("InnerClass1: constructor");
        }

        class InnerClass2 {
            InnerClass2() {
                System.out.println("InnerClass2: constructor");
            }

        }

    }

}
