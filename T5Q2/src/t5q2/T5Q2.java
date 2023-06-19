/*package t5q2;

public class T5Q2 {

    public static void main(String[] args) { 
    }
    
    
    else{                       // Line 01
    Node<E> temp = head;        // Line 02
    for(int i=0; i<index; i++){ // Line 03
        temp = temp.next;       // Line 04
    }                           // Line 05
    element = temp.element;     // Line 06
    temp.next.prev = temp.prev; // Line 07
    temp.prev.next = temp.next; // Line 08
    temp.next = null;           // Line 09
    temp.prev = null;           // Line 10
    size --;                    // Line 11
}                               // Line 12
}

Line 2 - Copy head to temp node
Line 3-5 - Traverse the node until the index i
Line 6 - Copy the element in the node of index to element
Line 7-10 - Disconnect the node from the list by link the previous node and next node of the node of index together
Line 11 - Reduce the size of doubly linked list after the removal of the node

head:                   index:                  tail:
--------    --------    --------    --------    --------
| prev | <- | prev | <- | prev | <- | prev | <- | prev |
--------    --------    --------    --------    --------
|  1   | .. |  2   |    |  3   |    |  4   | .. |  5   |
--------    --------    --------    --------    --------
| next | -> | next | -> | next | -> | next | -> | next |
--------    --------    --------    --------    --------

                            |
                            v

                ;-----------------------
head:           v       index:         |        tail:
--------    --------    --------    --------    --------
| prev | <- | prev |    | prev |    | prev | <- | prev |
--------    --------    --------    --------    --------
|  1   | .. |  2   |    |  3   |    |  4   | .. |  5   |
--------    --------    --------    --------    --------
| next | -> | next |    | next |    | next | -> | next |
--------    --------    --------    --------    --------
                |                      ^
                -----------------------'

                            |
                            v
    head:                                tail:
    --------    --------     --------    --------
    | prev | <- | prev |  <- | prev | <- | prev |
    --------    --------     --------    --------
    |  1   |    |  2   |     |  4   |    |  5   |
    --------    --------     --------    --------
    | next | -> | next |  -> | next | -> | next |
    --------    --------     --------    --------
*/