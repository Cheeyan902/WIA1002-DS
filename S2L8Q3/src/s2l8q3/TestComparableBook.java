package s2l8q3;

import java.util.Queue;

public class TestComparableBook {

    public static void main(String[] args) {

        Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();

        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));

        System.out.println(BookQueue);

        while (BookQueue.peek() != null) {
        
            System.out.println("Head Element: " + BookQueue.peek().toString());
        
            BookQueue.remove();
        
            System.out.println("Priority queue: " + BookQueue);
        }
    }
}

class ComparableBook implements Comparable<ComparableBook> {

    private int BookID;
    private String BookName;

    // Constructor
    public ComparableBook(int id, String name) {
        this.BookID = id;
        this.BookName = name;
    }
    
    //Get Methods
    public int getID(){
        return this.BookID;
    }
    
    public String getName(){
        return this.BookName;
    }
    
    //Set Methods
    public void setId(int id){
        this.BookID = id;
    }
    
    public void setName(String name){
        this.BookName = name;
    }
   
    // Methods
    @Override
    public boolean equals(Object o){
        if(!(o instanceof ComparableBook)){
            return false;
        }
        ComparableBook p = (ComparableBook) o;
        if(this.BookID == p.getID()){   
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.BookID;
    }
    
    @Override
    public String toString(){
        return String.format("(%d) %s", this.BookID, this.BookName);
    }
    @Override
    public int compareTo(ComparableBook cp){
       
        int cpId = cp.getID();
        String cpName = cp.getName();
        
        if(this.getID() < cpId){
            return -1;
        }
        
        if(this.getID() > cpId){
            return 1;
        }
        
        if(this.getID() == cpId){
            return this.getName().compareTo(cpName);
        }
        return 0;
    }
}