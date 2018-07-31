package as.interfaces_and_inner_classes.ex22;

public class OuterClass2 {

    OuterClass2() {
        System.out.println("OuterClass: constructor");
    }

    static class NestedClass1 {

        NestedClass1() {
            System.out.println("NestedClass1: constructor");
        }

        static class NestedClass2 {
            NestedClass2() {
                System.out.println("NestedClass2: constructor");
            }
        }

    }

}
