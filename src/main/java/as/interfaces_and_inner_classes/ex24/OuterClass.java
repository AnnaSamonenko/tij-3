package as.interfaces_and_inner_classes.ex24;

public class OuterClass {

    private int i;

    void printI(){
        System.out.println(i);
    }

    class InnerClass {
        InnerClass(int i) {
            OuterClass.this.i = i;
        }
    }

}
