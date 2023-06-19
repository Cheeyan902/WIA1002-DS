package s2l5q3;

public class DNode<E> {
    
    public E val;
    public DNode<E> prev;
    public DNode<E> next;

    // Constructors
    public DNode(E e) { 
        this(e, null, null); 
    }
    
    public DNode(E e, DNode<E> prev, DNode<E> next) {
        this.val = e;
        this.prev = prev;
        this.next = next;
    }
}
