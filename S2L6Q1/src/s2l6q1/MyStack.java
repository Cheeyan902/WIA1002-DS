package s2l6q1;

import java.util.ArrayList;

public class MyStack<E> {
    
    ArrayList<E> stack = new ArrayList<>();
    //or like this
    //private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
    
    //Constructor
    public MyStack(){
    }
    
    //Methods
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
        E o = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return o;
    }
    
    public E peek(){
        return this.stack.get(this.stack.size() - 1);
    }
    
    public int getSize(){
        return this.stack.size();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    @Override
    public String toString(){
        return this.stack.toString();
    }
    
    public boolean search(E e){
        return this.stack.contains(e);
    }
}
