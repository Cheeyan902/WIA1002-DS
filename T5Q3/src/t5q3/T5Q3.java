/*package t5q3;

public class T5Q3 {

    public static void main(String[] args) {
    }
    
}
head:       mid:                    tail:
--------    --------    --------    --------
| prev | <- | prev | <- | prev | <- | prev |
--------    --------    --------    --------
| 'a'  | .. | 'b'  |    | 'c'  | .. | 'd'  |
--------    --------    --------    --------
| next | <- | next | <- | next | <- | next |
--------    --------    --------    --------

public void addLast(E element){
    Node<E> tmp = new Node(element, null, tail);
    if(tail != null) {
        tail.next = tmp;
    }
    tail = tmp;
    if(head == null){
        head = tmp;
    }
    size++;
    System.out.println("adding: " + element);
}

addLast('z');
*/