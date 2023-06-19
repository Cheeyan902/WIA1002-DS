package SList;

public class SList<E> {
   
    //Instance varibales
    SNode<E> head;
    SNode<E> tail;
    int size;
    
    //Constructors
    public SList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    //Methods
    public void appendEnd(E e){
        SNode<E> newNode = new SNode<>(e,null);
        if(this.size == 0){
            this.head = this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    
    public E removeInitial(){
        if (this.size == 0) {
            System.out.println("List is empty");
            return null;
        } else if (this.size == 1) {
            SNode<E> tmp = this.head;
            this.head = this.tail = null;
            this.size = 0;
            return tmp.element;
        } else {
            SNode<E> temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = this.head;
        while(current != null){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        this.head = this.tail = null;
        this.size = 0;
        System.out.println("The list is empty.");
    }
    
    public void display(){
        SNode<E> current = this.head;
        while(current != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    
}
