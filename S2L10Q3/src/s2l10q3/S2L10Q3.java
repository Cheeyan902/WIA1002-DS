package s2l10q3;

public class S2L10Q3 {

    public static void main(String[] args) {
      
        System.out.println("Exponentiation of 10 wiht 3 : " + exponent(10,3));
    }
    
    public static long exponent(int x, int m){
        //Base cases
        if(m == 0){
            return 0;
        }
        if(m == 1){
            return x;
        }
        
        //Recursion cases
        return x * exponent(x, m-1);
    }
}
