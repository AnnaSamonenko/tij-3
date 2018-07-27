package as.collections.ex8.utils;

import java.util.ArrayList;
import java.util.List;

public class CatList {

    List cats = new ArrayList();

    public void add(Cat cat) {
        cats.add(cat);
    }

    public Cat get(int i) {
        return (Cat) cats.get(i);
    }

    public int size(){
        return cats.size();
    }
}
