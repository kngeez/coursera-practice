

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class DequeTest{
    Deque deq;

    @Before
    public void setUp() {
        deq = new Deque();
    }

    // Corner Cases

//    @Test(expected = NullPointerException.class)
//    public void testAddNull() {
//        deq.addFirst(null);
//    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveFromEmptyDeque() {
        deq.removeFirst();
    }

    // Corner Cases End

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
    public void testRemoveLast() {
        deq.addLast(1);
        assertEquals(deq.removeLast(), 1);
    }

    @Test
    public void testAddFirstRemoveLast() {
        deq.addFirst(1);
        assertEquals(deq.removeLast(), 1);
    }

    @Test
    public void testAddLastRemoveFirst() {
        deq.addLast(1);
        assertEquals(deq.removeFirst(), 1);
    }

    @Test
    public void testAddFirstTwiceThenRemoveLast() {
        deq.addFirst(1);
        deq.addFirst(2);
        assertEquals(deq.removeLast(), 1);
    }

    @Test
    public void testPrint() {
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addLast(3);
        deq.addFirst(4);
        deq.addLast(5);
        deq.addLast(6);
        System.out.println("Print First");
        deq.printFirst();
        System.out.println();
        System.out.println("Print Last");
        deq.printLast();
    }
}

