package t10q4;

public class T10Q4 {

    public static void main(String[] args) {
      
        int sum = sum(5);
        System.out.println("The sum of 5,4,3,2,1 is: " + sum);
    }
    
    public static int sum(int num){
        
        int result;
        if(num ==1)
            result = 1;
        else{
            result = num + sum(num-1);
        }
        return result;
    }
}
