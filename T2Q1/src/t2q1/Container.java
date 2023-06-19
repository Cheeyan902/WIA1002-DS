package t2q1;

public class Container <T> {
   
    private T t;
    
    //Constructors
    public Container(){
    }
    
    //Methods
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return this.t;
    }

    public static void main(String[] args) {
       
        Container <Integer> c1 = new Container<>();
        Container <String> c2 = new Container<>();
        
        c1.add(50);
        c2.add("Java");
        
        System.out.println(c1.retrieve());
        System.out.println(c2.retrieve());
    }
    
}
