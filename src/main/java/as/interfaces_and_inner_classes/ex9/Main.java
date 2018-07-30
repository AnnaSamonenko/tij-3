package as.interfaces_and_inner_classes.ex9;

public class Main {

    public static void main(String[] args) {
        Month month = Month.FEB;
        System.out.println(month);
        month = Month.number(4);
        System.out.println(month);
        System.out.println(Month.month[8]);
    }

}
