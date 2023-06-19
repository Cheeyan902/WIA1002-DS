package s2l2q2;

public class CompareMax {

    //generic method that extends the Comparable interface
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        
        //compare the three values a,b,c
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
    
    public static void main(String[] args) {
       
        //call method to display the value
        System.out.println(CompareMax.maximum("abcd","cdef","skdj"));
    }
}
