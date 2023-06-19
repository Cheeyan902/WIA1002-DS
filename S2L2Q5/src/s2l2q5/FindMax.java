package s2l2q5;

public class FindMax {
    
    public static void main(String[] args) {
        
        Integer [] a = {1,2,3};
        String [] b = {"red","green","blue"};
        Circle [] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        //Circle newcircle = max(c);
        
        System.out.println("Maximum value in a: " + max(a));
        System.out.println("Maximum value in b: " + max(b));
        System.out.println("Maximum value in c: " + max(c));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(E elem : list){
            if(elem.compareTo(max) > 0){
                max = elem;
            }
        }
        return max;
    }
}

class Circle implements Comparable<Circle>{
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "Radius of circle is " + this.radius + " cm";
    }
    
    @Override
    public int compareTo(Circle other){
        if(this.radius > other.radius){ return 1;}
        else if(
                this.radius < other.radius){ return -1;}
        else{
            return 0 ;
        }
    }
}