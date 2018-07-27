package as.collections.ex24;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Following the Queue.java example, create a Deque class and test it.
 */
public class Main {

    @Test
    public void testDeque() {
        Deque deque = new Deque();
        deque.putFirst(1);
        deque.putFirst(0);
        deque.putLast(2);
        deque.putLast(3);

        Assert.assertEquals(deque.toArray(), new Integer[]{0, 1, 2, 3});

        Assert.assertFalse(deque.isEmpty());
    }

}
