
public class Deque {
    private int size;
    private Node head;

    public Deque() {

    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }

    public void addFirst(int i) {
        head = new Node(i);
        size++;
    }

    public int removeFirst() {
        return head.getValue();
    }
}
