package as.interfaces_and_inner_classes.ex29;

public class OuterClass {

    void printInnerClassField() {
        System.out.print(new InnerClass().innerClassField);
    }

    class InnerClass {
        private int innerClassField = 5;
    }

}
