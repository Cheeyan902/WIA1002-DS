package t10q5;

public class T10Q5 {

    public static void main(String[] args) {
        
        System.out.print("The separated digit of 4567 is : ");
        printDigit(4567);
    }
    
    public static void printDigit(int n){
        if(n > 10){
            printDigit(n/10); //keep 45, 456, 4567 
            System.out.print(n%10 + " ");
        }
        else
            System.out.print(n%10 + " "); // case for 4
    }
}
