import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private int size;
    private Node head;
    private Node tail;

    public Deque() {}

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }

        if (head == null) {
            head = new Node(item);
            tail = head;
        } else {
            Node newHead = new Node(item);
            newHead.setNext(head);
            head.setPrevious(newHead);
            head = newHead;
        }
        size++;
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }

        if (tail == null) {
            tail = new Node(item);
            head = tail;
        } else {
            Node newTail = new Node(item);
            newTail.setPrevious(tail);
            tail.setNext(newTail);
            tail = newTail;
        }
        size++;
    }

    public Item removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Item returnValue = head.getValue();
        if (head.getNext() == null) {
            head = null;
            tail = null;
        } else if (head.getNext() == tail) {
            head = tail;
        } else {
            head = head.getNext();
        }
        size--;
        return returnValue;

    }

    public Item removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }

        Item returnValue = tail.getValue();
        if (tail.getPrevious() == null) {
            head = null;
            tail = null;
        } else if (tail.getPrevious() == head) {
            tail = head;
        } else {
            tail = tail.getPrevious();
        }
        size--;
        return returnValue;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    private class Node {
        private Item value;
        private Node next;
        private Node previous;

        public Node(Item value) {
            this.value = value;
        }

        public Item getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}
