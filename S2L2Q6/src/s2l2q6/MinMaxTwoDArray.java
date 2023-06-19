package s2l2q6;

public class MinMaxTwoDArray {

    public static <E extends Comparable<E>> E min(E[][] list){
        if(list.length == 0 || list[0].length == 0)
            return null;
        E minimum = list[0][0];
        for(E[] elem : list)
            for(E cont: elem )
            if(cont.compareTo(minimum) < 0)
                minimum = cont;
        
        return minimum;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
         if(list.length == 0 || list[0].length == 0)
            return null;
        E maximum = list[0][0];
        for(E[] elem : list)
            for(E cont: elem )
            if(cont.compareTo(maximum) > 0)
                maximum = cont;
            
        return maximum;
    }
    
    public static void main(String[] args) {
        
        Integer [][] numbers = {{4,5,6},{1,2,3}};
        System.out.printf("Minimum element in numbers: %s\n", MinMaxTwoDArray.<Integer>min(numbers));
        System.out.printf("Maximum element in numbers: %s\n", MinMaxTwoDArray.<Integer>max(numbers));
    }   
}
