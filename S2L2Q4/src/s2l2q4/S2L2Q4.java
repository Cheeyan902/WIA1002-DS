package s2l2q4;

public class S2L2Q4 {
    
    //generic method
    public static <T extends Comparable<T>> String minmax(T[] list){
        
        //Exception 
        if(list.length == 0)
            return "";
        
        //declare value for max and min variables
        T max = list[0], min = list[0]; 
        
        //for-each loop & compareTo methods
        for(T obj : list){
            if(obj.compareTo(max) > 0){
                max = obj;
            }
            if(obj.compareTo(min) < 0){
                min = obj;
            }
        }
        return "Min: " + min + ", Max: " + max;
    }
    
    public static void main(String[] args) {
        
        //Arrays
        Integer [] intArray = {5,3,7,1,4,9,8,2};
        String [] strArray = {"red","blue","orange","tan"};
        
        //Display values
        System.out.printf("%s\n" ,S2L2Q4.<Integer> minmax(intArray));
        System.out.printf("%s\n",S2L2Q4.<String> minmax(strArray));
    }
}
