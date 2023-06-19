package s2labtestq1;

public class DArbyStack<DArby> {

    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    private Node<DArby> head = null;
    private int size = 0;

    public void push(DArby o) {
        Node<DArby> newNode = new Node<>(o);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public DArby pop() {
        if (isEmpty()) {
            return null;
        }
        DArby item = head.item;
        head = head.next;
        size--;
        return item;
    }

    public DArby peek() {
        if (isEmpty()) {
            return null;
        }
        return head.item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Node<DArby> current = head;
        while (current != null) {
            sb.insert(1, current.item);
            if (current.next != null) {
                sb.insert(1, ", ");
            }
            current = current.next;
        }
        sb.append(']');
        return sb.toString();
    }

    public DArby remove(int k) {
        if (k <= 0 || k > size) {
            return null;
        }
        Node<DArby> current = head;
        Node<DArby> prev = null;
        for (int i = 1; i < k; i++) {
            prev = current;
            current = current.next;
        }
        if (prev != null) {
            prev.next = current.next;
        } else {
            head = current.next;
        }
        size--;
        return current.item;
    }
}
