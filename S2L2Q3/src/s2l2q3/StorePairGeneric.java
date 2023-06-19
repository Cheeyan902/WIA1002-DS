package s2l2q3;

public class StorePairGeneric <E extends Comparable<E>> implements Comparable<StorePairGeneric<E>> {

    private E first, second;
    
    public StorePairGeneric(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    public E getFirst(){
        return this.first;
    }
    
    public E getSecond(){
        return this.second;
    }
    
    public void setPair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object object){
        if(object instanceof StorePairGeneric){
            StorePairGeneric<E> o = (StorePairGeneric<E>) object;
            return this.first.compareTo( o.getFirst()) == 0;
            //return this.first.equals(o.first);
        }
        return false;
    }
    
    /*public boolean equals(StorePairGeneric<E> e){
          return this.first.equals(e.getFirst());
    }*/
    
    @Override
    public int compareTo(StorePairGeneric<E> e){
        return this.first.compareTo(e.getFirst());
    }
    
    public static void main(String[] args) {
       
        StorePairGeneric <Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric <Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric <Integer> c = new StorePairGeneric<>(6,3);
        
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());
        
        //Compare first value for each object with equals() method
        System.out.println("First value in a equals b ? " + a.equals(b));
        System.out.println("First value in a equals c ? " + a.equals(c));
        System.out.println("First value in b equals c ? " + b.equals(c));
        
        //Compare first value for each object with compareTo() method
        System.out.println("First value in a compare to b : " + a.compareTo(b));
        System.out.println("First value in a compare to c : " + a.compareTo(c));
        System.out.println("First value in b compare to c : " + b.compareTo(c));
    }
    
}
