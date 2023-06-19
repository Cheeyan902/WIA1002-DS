package s2l2q1;

public class MyGeneric <E> {
    
    private E e;
    
    //constructor with no-args
    public MyGeneric(){
    }
    
    //constructor with parameters
    public MyGeneric(E e){
        this.e = e;
    }
    
    //setter method
    public void setE(E e){
        this.e = e;
    }
    
    //getter method
    public E getE(){
        return e;
    }
    
    public static void main(String[] args) {
       //instances of generic class
       MyGeneric <String> strObj = new MyGeneric<>("Hello");
       MyGeneric <Integer> intObj = new MyGeneric<>(214);
       
       //display values using getter method
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
    
}
