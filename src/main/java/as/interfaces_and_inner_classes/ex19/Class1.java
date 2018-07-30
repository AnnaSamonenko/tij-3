package as.interfaces_and_inner_classes.ex19;

public class Class1 {
    private int privateField;

    private void privateMethod() {
        System.out.print(privateField);
    }

    public Modifier callModifier() {

        return new Modifier() {
            public void changeField(int value) {
                privateField = value;
            }

            public void callPrivateMethod() {
                privateMethod();
            }
        };
    }

    // try with private
    interface Modifier {
        void callPrivateMethod();

        void changeField(int value);
    }

}
