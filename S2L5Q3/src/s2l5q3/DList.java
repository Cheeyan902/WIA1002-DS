package s2l5q3;

import java.util.NoSuchElementException;

public class DList<E> {
   
    //Instance Variable
    private DNode<E> head;
    private DNode<E> tail;
    private int size = 0;
    
    //Constructor
    public DList(){
        this.head = null;
        this.tail = null;
    }
    
    //Method
    public void addFirst(E e){
        DNode<E> firstNode = new DNode<>(e, null, this.head);
        if(this.head != null){
            this.head.prev = firstNode;
        }
        if(this.tail == null){
            this.tail = firstNode;
        }
        this.size++;
        System.out.println("adding: " + e);
    }
    
    public void addLast(E e){
        DNode<E> lastNode = new DNode<>(e, this.tail, null);
        if(this.tail != null){
            this.tail.next = lastNode;
            this.tail = lastNode;
        }
        if(this.head == null){
            this.head = lastNode;
        }
        this.size++;
        System.out.println("adding: " + e);
    }
    
    /*public void add(int index, E e){
        if(index < 0 || index > this.size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            this.addFirst(e);
        }else if(index == this.size){
            this.addLast(e);
        }else{
            DNode<E> current = this.head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            
            DNode<E> insert = new DNode(e, current, current.prev);
            
            //set pointer 'next' of the node temp.prev to new node insert
            current.prev.next = insert;
            
            //set pointer 'prev' of the node temp to new node insert
            current.prev = insert;
            this.size++;
            System.out.println("adding: " + e);
        }   
    }*/
    
    public void add(int index, E e) {
        if (index < 0 || index > this.size) throw new IndexOutOfBoundsException();
        if (index == 0) this.addFirst(e);
        else if (index == this.size) this.addLast(e);
        else {
            DNode<E> currentNode;
            if (index < (this.size + 1) / 2) {
                currentNode = this.head;
                for (int i = 0; i < index; i++) currentNode = currentNode.next;
            }
            else {
                currentNode = this.tail;
                for (int i = this.size - 1; i > index; i--) currentNode = currentNode.prev;
            }
            DNode<E> newNode = new DNode<>(e, currentNode.prev, currentNode);
            currentNode.prev.next = newNode;
            currentNode.prev = newNode;
            this.size++;
        }
    }
    
    public void traverseForward(){
        System.out.println("iterating forward...");
        DNode<E> current = this.head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void traverseBackward(){
        System.out.println("iterating backward...");
        DNode<E> current = this.tail;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.prev;
        }
        System.out.println();
    }
    
    public E removeFirst(){
        if(this.size == 0){
            throw new NoSuchElementException();
        }
        DNode<E> firstNode = this.head;
        this.head = this.head.next;
        this.head.prev = null;
        this.size--;
        System.out.println("deleted: " + firstNode.val);
        return firstNode.val;
    }
    
    public E removeLast(){
        if(this.size == 0){
            throw new NoSuchElementException();
        }
        DNode<E> lastNode = this.tail;
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size--;
        System.out.println("deleted: " + lastNode.val);
        return lastNode.val;
    }
    
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new NoSuchElementException();
        }else if(index == 0){
            return removeFirst();
        }else if(index == size - 1){
            return removeLast();        
        }else{
            DNode<E> current = this.head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            current.next.prev = current.prev;
            current.prev.next = current.next;
            current.next = null;
            current.prev = null;
            
            System.out.println("deleted: " + current.val);
            return current.val;
        }
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void clearAll(){
        DNode<E> current = this.head;
        while(this.head != null){
            current = this.head.next;
            this.head.prev = this.head.next = null;
            this.head = current;
        }
        this.tail.prev = this.tail.next = null;
        System.out.printf("successfully cleared %d nodes.\n", this.size);
        this.size = 0;
    }
    
    public void printSize(){
        System.out.println("size of current Doubly Linked List: " + this.size);
    }
}
