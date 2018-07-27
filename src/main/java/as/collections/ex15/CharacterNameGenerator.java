package as.collections.ex15;

import as.collections.ex1.util.Generator;

import java.util.*;

class CharacterNameGenerator implements Generator {
    private List names = new LinkedList();
    private Iterator it;

    CharacterNameGenerator() {
        Collections.addAll(names, "Leia Skywalker", "Luke Skywalker",
                "Chubakka", "Yoda", "Enakin Skywalker",
                "Darth Vader", "Han Solo", "Old Big One",
                "c3p0", "r2d2");
    }

    public Object next() {
        if (it == null || !it.hasNext()) {
            it = names.iterator();
        }
        return it.next();
    }

    void fill(Collection c, int amountOfNames) {
        for (int i = 0; i < amountOfNames; i++) {
            c.add(next());
        }
    }
}
