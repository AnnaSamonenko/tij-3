package as.interfaces_and_inner_classes.ex25;

/**
 * Repair the problem in WindError.java.
 */

class NoteX {
    public static final int
            middleC = 0, cSharp = 1, cFlat = 2;
}

class InstrumentX {
    public void play(int NoteX) {
        System.out.println("InstrumentX.play()");
    }
}

class WindX extends InstrumentX {
    // OOPS! Changes the method interface:
    public void play(int NoteX) {
        System.out.println("WindX.play(NoteX n)");
    }
}

public class WindError {
    public static void tune(InstrumentX i) {
        // ...
        i.play(NoteX.middleC);
    }

    public static void main(String[] args) {
        WindX flute = new WindX();
        tune(flute); // Not the desired behavior!
    }
}
