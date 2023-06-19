package s2l4q1;

public class Node<E> {
    
    //Two components 
    public E element;
    public Node<E> next;
    
    //Default constructor
    public Node(){
        this.element = null;
    }
    
    //Constructir accepts an item for element variable
    public Node(E element){
        this.element = element;
    }
}
