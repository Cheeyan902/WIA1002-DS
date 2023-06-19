package s2l6q1;

public class L6Q3 {
    
    public int sum(MyStack<Integer> S){
        
        if(S.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        
        while(!S.isEmpty()){
            sum += S.pop();
        }
        
        return sum;
    }
}
