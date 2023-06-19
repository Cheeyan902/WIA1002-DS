package s2l4q1;

public class MyLinkedList<E> {
    
    //Instances variables
    private Node<E> head;
    private Node<E> tail;
    public int size = 0;
    
    //Constructors
    public MyLinkedList(){
       this.head = null;
       this.tail = null;
    }
    
    //Methods
    public void addFirst(E e) {
        
        Node<E> firstNode = new Node<>(e);
        firstNode.next = this.head;
        this.head = firstNode;

        if (this.tail == null) this.tail = this.head;

        this.size++;
    }
    
    public void addLast(E e){
        
        Node<E> lastNode = new Node<>(e);
        
        if(this.tail == null){
            this.head = this.tail = lastNode;
        }
        else{
            this.tail.next = lastNode;
            this.tail = this.tail.next;
        }
        this.size++;
    }
    
    public void add(int index, E e){
        
        if(index >= this.size)
            this.addLast(e);
        else if(index == 0)
            this.addFirst(e);
        else{
            
            Node<E> newNode = new Node<>(e);
            Node<E> current = this.head;
            
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            newNode.next = current.next; //change the newNode.next to the head of node behind of it after insert
            current.next = newNode; //change the current node .next to head of new node
            this.size++;
        }
    }
    
    public E removeFirst(){
        
        if(this.size == 0)
            return null;
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null) tail = null;
            return temp.element;
        }   
    }
    
    public E removeLast(){
        
        if(this.size == 0){
            return null;}
        else if(this.size == 1){
            Node<E> temp = head;
            this.head = this.tail = null;
            this.size = 0;
            return temp.element;
        }else{
            Node<E> current = head;
            for(int i = 0; i < this.size-2; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index){
        if(index >= size || index < 0)
            return null;
        else if(index == 0){
            return this.removeFirst();
        }else if(index == size-1){
            return this.removeLast();
        }else{
           
            Node<E> current = this.head;
            
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        
        Node<E> current = this.head;
        
        for(int i = 0; i < this.size; i++){
            if(current.element.equals(e)){
            System.out.println(current.element);
            return true;}
            current = current.next;
        }
        return false;
    }
    
    //public boolean contains(E e){ return this.indexOf(e) >= 0; }
    
    public E get(int index){
        
        Node<E> current = this.head;
        
        if(index < 0 || index >= this.size)
            return null;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.element;
    }
    
    public E getFirst(){
        return this.head.element;
    }
    
    public E getLast(){
        return this.tail.element;
    }
    
    public int indexOf(E e){
        
        Node<E> current = this.head;
        int index = 0;
        
        while(current != null){
            if(current.element == e)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        
        Node<E> current = this.head;
        int index = 0, lastIndex = 0;
        
        while(current != null){
            if(current.element == e){
                lastIndex = index;
                return lastIndex;
            }
             current = current.next;
             index++;
        }
       lastIndex = -1;
       return lastIndex;
    }
    
    public E set(int index, E e){  
        
        //if(index < 0 || index >= this.size)
        //  throw new IndexOutOfBoundsException("Invalid index " + index);
        //Remove the element at the specified index
        E removedElement = remove(index);
        //Add the new element at the same index
        add(index, e);
        //Return the removed element
        return removedElement;
    }
    
    public void clear(){
        while(this.size != 0){
            removeFirst();
        }
    }
    
    public void print(){
        
        Node<E> current = this.head;
        
        for(int i = 0; i < this.size; i++){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void reverse(){
        
        Node<E> current = this.head;
        E[] arr = (E[]) new Object[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = current.element;
            current = current.next;
        }
        
        for(int i = size - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public int getSize(){
        return this.size;
    }
    
    public E getMiddleValue(){
        return get((size - 1) / 2);
    }
}
