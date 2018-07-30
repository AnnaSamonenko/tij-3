package as.interfaces_and_inner_classes.ex11.util3;

import as.interfaces_and_inner_classes.ex11.util1.Interface1;
import as.interfaces_and_inner_classes.ex11.util2.Class1;

public class Class2 extends Class1 {

    public Interface1 getClass1() {
        //Class1 c = new Class1();
        return (Interface1) new InnerClass();
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.getClass1().method();
    }

}
