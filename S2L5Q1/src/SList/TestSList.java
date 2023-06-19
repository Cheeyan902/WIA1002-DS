package SList;

public class TestSList {
    
    public static void main(String[] args) {
        
        SList<String> s1 = new SList<>();
        
        //Append the following values individually: "Linked list, is, easy."
        s1.appendEnd("Linked list");
        s1.appendEnd("is");
        s1.appendEnd("easy");
        
        //Display these values
        s1.display();
        
        //Remove the word "Linked list" and display the removed value
        s1.removeInitial();
        
        //Check if 'difficult' is in the list
        System.out.println(s1.contains("difficult"));
        
        //Clear the list
        s1.clear();
        
        //Check
        s1.display();
    }
}
