package as.interfaces_and_inner_classes.ex16;

public class CFirst {

     class InnerClass implements IFirst {
        @Override
        public void method() {
            System.out.println("InnerClass");
        }
    }

    public IFirst getInnerClass() {
        return new InnerClass();
    }
}
