package as.collections.ex35;
/**
 * Implement the rest of the Map interface for SlowMap.
 */

public class Main {

    public static void main(String[] args) {

        SlowMap slowMap = new SlowMap();
        slowMap.put(1, "Karla");
        slowMap.put(2, "Odie");
        slowMap.put(3, "Monika");

        slowMap.remove(2);

        System.out.println(slowMap.keySet());
        System.out.println(slowMap.values());
        System.out.println(slowMap.size());
        System.out.println(slowMap.isEmpty());

        System.out.println(slowMap);

    }

}
