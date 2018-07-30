package as.interfaces_and_inner_classes.ex9;

public final class Month {
    private String name;
    private static int counter = 1;
    private int order = counter++;

    private Month(String nm) {
        name = nm;
    }

    public String toString() {
        return name;
    }

    public final static Month
            JAN = new Month("January"),
            FEB = new Month("February"),
            MAR = new Month("March"),
            APR = new Month("April"),
            MAY = new Month("May"),
            JUN = new Month("June"),
            JUL = new Month("July"),
            AUG = new Month("August"),
            SEP = new Month("September"),
            OCT = new Month("October"),
            NOV = new Month("November"),
            DEC = new Month("December");
    public final static Month[] month = {
            JAN, FEB, MAR, APR, MAY, JUN,
            JUL, AUG, SEP, OCT, NOV, DEC
    };

    public final static Month number(int ord) {
        return month[ord - 1];
    }

}
