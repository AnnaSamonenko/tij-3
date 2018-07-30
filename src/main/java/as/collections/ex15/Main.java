package as.collections.ex15;

import java.util.*;

/**
 * Create a generator that produces character names from your favorite movies
 * (you can use Snow White or Star Wars as a fallback) and loops around to the beginning when it runs out of names.
 * Use the utilities in com.bruceeckel.util1 to fill an array, an ArrayList,
 * a LinkedList, and both types of Set, then print each container. .
 */
public class Main {

    public static void main(String[] args) {
        CharacterNameGenerator characterNameGenerator = new CharacterNameGenerator();
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Set treeSet = new TreeSet();
        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        characterNameGenerator.fill(arrayList, 5);
        System.out.print(arrayList);
        characterNameGenerator.fill(linkedList, 5);
        System.out.print(linkedList);
        characterNameGenerator.fill(treeSet, 5);
        System.out.print(treeSet);
        characterNameGenerator.fill(hashSet, 5);
        System.out.print(hashSet);
        characterNameGenerator.fill(linkedHashSet, 5);
        System.out.print(linkedHashSet);
    }

}
