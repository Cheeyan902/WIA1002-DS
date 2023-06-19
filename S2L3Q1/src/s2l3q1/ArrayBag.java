package s2l3q1;

import java.util.Arrays;

public class ArrayBag<T> implements BagInterface<T>{
    
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    
    @SuppressWarnings("unchecked")
    public ArrayBag(){
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull(){
        return (numberOfEntries == bag.length);
    }
    
    @Override
    public boolean isEmpty(){
        return (numberOfEntries == 0);
    }
    
    @Override
    public boolean add(T newEntry){
        if(isFull()){
            return false;
        }else{
            numberOfEntries++;
            bag[numberOfEntries - 1] = newEntry;
            return true;
        }       
    }
    
    @Override
    public T remove(){
        if(isEmpty()){
            return null;
        }else{
            T result = this.bag[numberOfEntries - 1];
            this.bag[this.numberOfEntries - 1] = null;
            numberOfEntries--;
            return result;
        }
    }
    
    @Override
    public boolean remove (T anEntry){
        if(isEmpty()){
            return false;
        }else{
            for(int i = 0; i < numberOfEntries; i++){
                if(bag[i].equals(anEntry)){
                    bag[i] = null;
                    
                    for(int j = i; j < numberOfEntries; j++){
                        bag[j] = bag[j+1];
                    }
                    
                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override 
    public void clear(){
        Arrays.fill(bag,null);
        numberOfEntries = 0;
    }
    
    @Override
    public int getFrequencyOf(T anEntry){
        int count = 0;
        for(int i = 0; i < numberOfEntries; i++){
            if(bag[i].equals(anEntry)){
                count++;
            }
        }
        return count;
    }
    
    @Override
    public boolean contains(T anEntry){
        for(int i = 0; i < numberOfEntries; i++){
            if(bag[i] == anEntry){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public T[] toArray(){
        T[] result = (T[]) new Object[numberOfEntries];
        
        /* for(T t : result){
            t = (T) result;
        } */
        
        /* for(int i = 0; i < numberOfEntries; i++){
               result[i] = bag[i];
        }
        */
        System.arraycopy(bag, 0, result, 0, numberOfEntries);
        return result;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<T> bag2){
        BagInterface<T> result = new ArrayBag<>();
        T[] bag1Array = toArray();
        for(T t : bag1Array){
            result.add(t);
        }
        T[] bag2Array = bag2.toArray();
        for(T t : bag2Array){
            result.add(t);
        }
        return result;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> bag2) {
        BagInterface<T> result = new ArrayBag<>();
        T[] bag1Array = toArray();
        T[] bag2Array = bag2.toArray();
        for (T t : bag1Array){
            result.add(t);
        }

        for(int i = 0; i < bag1Array.length; i++){
            boolean found = false;
            for (int j = 0; j < bag2Array.length; j++){
                if (bag1Array[i].equals(bag2Array[j])){
                    found = true;
                    bag2Array[j] = bag2Array[bag2Array.length - 1];
                    bag2Array[bag2Array.length - 1] = null;
                    break;
                }
            }
            if (!found){
                result.remove(bag1Array[i]);
            }
        }
        return result;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> bag2){
        BagInterface<T> result = new ArrayBag<>();
        T[] bag1Array = toArray();
        T[] bag2Array = bag2.toArray();
        for (T t : bag1Array){
            result.add(t);
        }
        for (int i = 0; i < bag1Array.length; i++){
            for (int j = 0; j < bag2Array.length; j++){
                if (bag1Array[i].equals(bag2Array[j])){
                    result.remove(bag1Array[i]);
                    bag2Array[j] = bag2Array[bag2Array.length - 1];
                    bag2Array[bag2Array.length - 1] = null;
                    break;
                }
            }
        }
        return result;
    }
}
