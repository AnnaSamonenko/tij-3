package as.interfaces_and_inner_classes.ex21;

public interface InterfaceWithClass {

    class NestedClass {
        private int i = 12;

        void printI() {
            System.out.println(i);
        }
    }

}
