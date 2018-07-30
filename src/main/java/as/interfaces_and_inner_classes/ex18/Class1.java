package as.interfaces_and_inner_classes.ex18;

public class Class1 {
    private int privateField;

    private void privateMethod() {
        System.out.print(privateField);
    }

    public void callModifier() {
        Modifier modifier = new Modifier();
        modifier.changeField(4);
        modifier.callPrivateMethod();
    }

    // try with private
    private class Modifier {
        void changeField(int value) {
            privateField = value;
        }

        void callPrivateMethod() {
            privateMethod();
        }
    }

}
