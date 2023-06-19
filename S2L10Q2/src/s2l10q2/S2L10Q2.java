package s2l10q2;

public class S2L10Q2 {

    public static void main(String[] args) {
       
        permuteString("","ABC");
    }
    
    public static void permuteString(String beginningString, String endingString){
        if(endingString.length() <= 1){
            System.out.println(beginningString + endingString); //production here
        }else{
            for(int i = 0; i < endingString.length(); i++){
                
                String newString = endingString.substring(0,i) + endingString.substring(i+1); //get BC 
                permuteString(beginningString + endingString.charAt(i), newString); //first iteration i = 0, pass (A, BC) then pass to iteration again to produce AB,C and AC,B
            }                                                                                     // second and third iteration are used for BAC and CAB
        }
    }
}

/*
Workflow
1. permuteString("A","BC")
- 2. permuteString("AB","C") = "ABC"
- 3. permuteString("AC","B") = "ACB"
4. permuteString("B","AC")
- 5. permuteString("BA","C") = "BAC"
- 6. permuteString("BC","A") = "BCA"
7. permuteString("C","AB")
- 8. permuteString("CA","B") = "CAB"
- 9. permuteString("CB","A") = "CBA"
*/