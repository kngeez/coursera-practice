

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DequeTest{
    Deque deq;

    @Before
    public void setUp() {
        deq = new Deque();
    }

    @Test
    public void testIsEmpty() {
        assertEquals(deq.isEmpty(), true);
    }

    @Test
    public void testSizeZero() {
        assertEquals(deq.size(), 0);
    }

    @Test
    public void testSizeOne() {
        deq.addFirst(1);
        assertEquals(deq.size(), 1);
    }

    @Test
    public void testSizeTwo() {
        deq.addFirst(1);
        deq.addFirst(2);
        assertEquals(deq.size(), 2);
    }

    @Test
    public void testRemoveFirst() {
        deq.addFirst(1);
        assertEquals(deq.removeFirst(), 1);
    }

    @Test
    public void testRemoveFirst_SecondValueAdded() {
        deq.addFirst(1);
        deq.addFirst(2);
        assertEquals(deq.removeFirst(), 2);
    }
}

