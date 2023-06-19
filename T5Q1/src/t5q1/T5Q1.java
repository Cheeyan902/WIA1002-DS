/*package t5q1;

public class T5Q1<E>{

    public static void main(String[] args) {
    }
    
       public E xyz(int index, E e) {
           
        Node<E> current = head;
        Node<E> temp;
        
        if (index < 0 || index > size) {
            return null;
            // return new IndexOutOfBoundException();
        } else if (index == size) {
            return this.addLast(e);
        } else if (index == 0) {                     // Line 10
            temp = head;
            head.element = e;
            return temp.element;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            temp = current.next;
            current.next.element = e;
            return temp.element;
        }                                           // Line 21
    }
}

Line 10 - 21 adds the element e of generic type E into the linked list with respective index stated.
Line 10 to 14 adds the element e to the first node of the linked list, whereas line 14 to line 21 adds e to any index position in the linked list.

The main purpose of method xyz() is to insert a node of element e into the linked list with particular index.
*/
