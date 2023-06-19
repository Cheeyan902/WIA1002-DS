package s2l6q1;

public class L6Q4 {
    
    public static boolean isPalindrome(String s){
        
        MyStack<Character> stack = new MyStack<>();
        
        //Build Stack
        for(int i = 0; i < s.length() ; i++){
            stack.push(s.charAt(i));
        }
        
        //Pop Stack
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse += stack.pop();
        }
        
        return s.equals(reverse);
    }
    
    public static void main(String[] args){
        System.out.printf("Is 'abcabc' palindromic ? %s\n", isPalindrome("abcabc"));
        System.out.printf("Is 'abababa' palindromic ? %s\n", isPalindrome("abababa"));
        System.out.printf("Is 'yinshuan' palindromic ? %s\n", isPalindrome("yinshuan"));
    }
}
