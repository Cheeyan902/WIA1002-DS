package SList;

public class SNode<E> {
    
    E element;
    SNode<E> next;
    
    public SNode(){
        this(null, null);
    }
    
    public SNode(E element, SNode<E> n){
        this.element = element;
        this.next = n;
    }
}
