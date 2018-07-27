package as.collections.ex32;

/**
 * Using SlowMap.java for inspiration, create a SlowSet.
 */
public class Main {

    public static void main(String[] args) {
        SlowSet slowSet = new SlowSet();

        slowSet.add("sun");
        slowSet.add("mars");
        slowSet.add("sun");
        slowSet.add(null);
        slowSet.add(null);

        System.out.println(slowSet);
    }

}
