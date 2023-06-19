package t10q3;

public class T10Q3 {

    public static void main(String[] args) {
        
        String reversedString = reverse("String", 0);
        String reversedString2 = reverse2("String");
        System.out.println("The reverse of String is : " + reversedString);
        System.out.println("The reverse of String 2 is :" + reversedString2);
    }
    
    public static String reverse(String string, int numPosition){
        
        // Base Case
        if(numPosition == string.length()-1) 
            return "" + string.charAt(numPosition);
        
        // Recursion
        return reverse("string" , numPosition + 1) + string.charAt(numPosition);
    }
    
    public static String reverse2(String str){
        
        //Base Case
        if((null == str) || (str.length() <= 1)){
            return str;
        }
        
        //Recursion Case 
        return reverse2(str.substring(1)) + str.charAt(0);
    }
}
