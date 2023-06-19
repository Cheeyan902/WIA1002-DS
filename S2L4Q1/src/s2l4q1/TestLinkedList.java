package s2l4q1;

public class TestLinkedList {

    public static void main(String[] args) {
        
        MyLinkedList<Character> list = new MyLinkedList<>();
        
        // Append the following : a,b,c,d,e
        list.addFirst('a');
        list.add(1,'b');
        list.add(2,'c');
        list.add(3,'d');
        list.addLast('e');
        
        // Print all element in the list
        list.print();
        
        // Reverse all element in the list
        list.reverse();
        
        // Retrieve the number of elements in the list
        System.out.printf("The number of elements in the list is %s\n",list.getSize());
        //System.out.println(list.getMiddleValue());
        
        // Retrieve the first and last value
        System.out.printf("First element is %s\n", list.getFirst());
        System.out.printf("Last element is %s\n", list.getLast());
        
        // Delete the third value
        System.out.println(list.remove(2));
        
        // Retrieve the index location for the second and third value
        System.out.printf("Index location for b: %s\n", list.indexOf('b'));
        System.out.printf("Index location for c: %s\n", list.indexOf('c'));
        
        // Check if the list has the value 'c'
        System.out.printf("The list contains 'c' ? %s\n", list.contains('c'));
        
        // Replace the items individually with the following: j,a,v,a.
        list.set(0,'j');
        list.set(1,'a');
        list.set(2,'v');
        list.set(3,'a');
        list.print();
        
    }
    
}
