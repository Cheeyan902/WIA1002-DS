package s2l10q1;

public class S2L10Q1 {

    public static void main(String[] args) {
        
        String s1 = "flabbergasted", s2 = "Astronaut";
        System.out.println("s1 after being substituted : " + substituteAI(s1));
        System.out.println("s2 after being substituted : " + substituteAI(s2));
    }
    
    public static String substituteAI(String s){
        
        //Base case
        if(s.isEmpty()) return "";
        
        //Recursion Case
        if(s.charAt(0) == 'a'){
            return 'i' + substituteAI(s.substring(1)); //if the current first char is a then replace it with i and append the rest of char after it 
        }else{
            return s.charAt(0) + substituteAI(s.substring(1)); //if the current first word is not a then no need replace and continue check word afterward
        }
    }
    
}
