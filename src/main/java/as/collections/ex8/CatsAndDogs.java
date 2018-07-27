package as.collections.ex8;

import as.collections.ex8.utils.Cat;
import as.collections.ex8.utils.CatList;

/**
 * Repair CatsAndDogs.java by creating a Cats container (utilizing ArrayList)
 * that will only accept and retrieve Cat objects.
 */

public class CatsAndDogs {

    public static void main(String[] args) {
        CatList cats = new CatList();
        for (int i = 0; i < 7; i++)
            cats.add(new Cat(i));
        // Not a problem to add a dog to cats:
        //cats.add(new Dog(7));
        for (int i = 0; i < cats.size(); i++)
            cats.get(i).id();
        // Dog is detected only at run time
    }
}
