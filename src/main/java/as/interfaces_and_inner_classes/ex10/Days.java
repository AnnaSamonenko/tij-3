package as.interfaces_and_inner_classes.ex10;

/**
 * Following the example given in Month.java, create an enumeration of days of the week.
 */

public class Days {

    private String name;
    private int counter;

    private Days(String name) {
        this.name = name;
    }

    public static final Days
            MO = new Days("Monday"),
            TU = new Days("Tuesday"),
            WE = new Days("Wednesday"),
            TH = new Days("Thursday"),
            FR = new Days("Friday"),
            SA = new Days("Saturday"),
            SU = new Days("Sunday");

    public final static Days[] days = new Days[]{
            MO, TU, WE, TH, FR, SA, SU
    };

    public String toString() {
        return this.name;
    }

}
