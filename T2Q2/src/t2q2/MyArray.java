package t2q2;

public class MyArray {

    //Generic Method
    public static <E> void listAll(E[] list){
        for(E elem : list){
            System.out.printf("%s ",elem);
        }
        System.out.println();
    }
    
    //Main
    public static void main(String[] args) {
        
        //Arrays
        Integer [] numbers = {1,2,3,4,5};
        String [] names = {"Jane","Tom","Bob"};
        Character [] alphabet = {'a','b','c'};
        
        //listAll(numbers); or can write like this 
        MyArray.<Integer>listAll(numbers);
        MyArray.<String>listAll(names);
        MyArray.<Character>listAll(alphabet);
    }
    
}
