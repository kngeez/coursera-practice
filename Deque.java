import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque implements Iterable{
    private int size;
    private Node head;
    private Node tail;

    public Deque() {}

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }

    public void addFirst(int i) {
        size++;
        if (head == null) {
            head = new Node(i);
            tail = head;
        } else {
            Node newHead = new Node(i);
            newHead.setNext(head);
            head.setPrevious(newHead);
            head = newHead;
        }
    }

    public void addLast(int i) {
        size++;
        if (tail == null) {
            tail = new Node(i);
            head = tail;
        } else {
            Node newTail = new Node(i);
            newTail.setPrevious(tail);
            tail.setNext(newTail);
            tail = newTail;
        }
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        int returnValue = head.getValue();
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

    public int removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }

        int returnValue = tail.getValue();
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

    public void printFirst() {
        Node temp = head;
        while (temp.getNext() != null) {
            System.out.print(temp.getValue() + ", ");
            temp = temp.getNext();
        }
        System.out.print(temp.getValue());
    }

    public void printLast() {
        Node temp = tail;
        while (temp.getPrevious() != null) {
            System.out.print(temp.getValue() + ", ");
            temp = temp.getPrevious();
        }
        System.out.print(temp.getValue());
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
