package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a new class called Gerbil with an int gerbilNumber thats initialized in the constructor
 * (similar to the Mouse example in this chapter). Give it a method called hop( )
 * that prints out which gerbil number this is, and that its hopping.
 * Create an ArrayList and add a bunch of Gerbil objects to the List.
 * Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
 */

public class Main {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();

        for (int i = 1; i < 10; i++)
            gerbils.add(new Gerbil(i));

        for (Gerbil g : gerbils)
            g.hop();
    }
}
