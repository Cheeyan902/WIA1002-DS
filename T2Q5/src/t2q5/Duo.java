package t2q5;

public class Duo <A,B> {

    public A first;
    public B second;
    
    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    //Additional getter methods
    public A getFirst(){
        return this.first;
    }
    
    public B getSecond(){
        return this.second;
    }
    
    public static void main(String[] args) {
        Duo <String,Integer> sideShape = new Duo<>("a",0);
        Duo <Double,Double> points = new Duo<>(0.0,0.0);
        
        System.out.println(sideShape.getFirst());
        System.out.println(sideShape.getSecond());
        System.out.println(points.getFirst());
        System.out.println(points.getSecond());
    }
}