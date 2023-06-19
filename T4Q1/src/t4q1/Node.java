package t4q1;

public class Node<E>{
    
/*  Q1.1
    Node<Character> node1 = new Node<>('a');
    Node<Character> node2 = new Node<>('b');
    
    Node<Character> head = node1;
    Node<Character> tail = node2;
    
    Q1.2
    head:   tail:
    node1 ->node2
    
    Q1.3
    node1.next = node2;
    
    Q1.4
    Node<Character> firstNode = new Node<>('f');
    firstNode -> node1 -> node2
    
    Q1.5
    -we have no information about the status of a linked-list
    -if the linked-list is empty,the new node becomes the head and tail.
    -if the linked-list is not empty, the new node becomes the head, and its next reference points to the old head.
    
    Q1.6
    public void addFirst(E e){
        Node<E> firstNode = new Node<>(e); //set firstNode to e value
        firstNode.next = head; //set firstNode.next becomes origin head
        head = firstNode; //make head become firstNode
        size++;
        if(tail == null){ //no node exists
            tail = head; //both becomes firstNode
    }
   }
    
    Q1.7
    firstNode.next = head;
    head = firstNode;
    
    Q1.8
    *addLast('c')
    
    START 
        IF tail == null
            head = tail = 'c'
            size = 1
        ELSE    
            tail.next = 'c'
            tail = tail.next
            size++
        ENDIF
    STOP
    
    head:                          tail:
    firstNode -> node1 -> node2 -> ['c']
    
    *add(2,'d')
    
    START
         IF tail == null //which means no node
            head = tail = 'd' //assign head and tail to d value
            size = 1
         ELSE IF index == 0
            addFirst('d')
         ELSE IF 2 >= size
            addLast('d')
         ELSE 
            current = head //set current as head
            Iterate (1) current = current.next //transverse until a node before added node
            temp = current.next //copy a current.next of current node for after usage
            current.next = 'd' //assign current.next to a new value 'd' of new node
            current.next.next = temp //assign .next of new node to temp that we copy just now
            size++
         ENDIF
    STOP
    
    head:                                   tail:
    firstNode -> node1 -> ['d'] -> node2 -> ['c']
    
    *removeFirst()
    
    START
        IF size == 0  //check if list is empty,then return null
            return null
        ELSE 
            temp = head //copy the origin head to show in return 
            head = head.next //declare a new head 
            size--
            return temp.element
        ENDIF
    STOP
    
    head:                      tail:
    node1 -> ['d'] -> node2 -> ['c']
    
    *removeLast()
    
    START
        IF size == 0
            return null
        ELSE IF size == 1
            temp = head
            head = tail = null
            size = 0
            return temp.element 
        ELSE
            current = head
            Iterate(size - 2) current = current.next
            temp = tail
            tail = current
            tail.next = null
            size--
            return temp.element
        ENDIF
    STOP
    
    head:             tail:
    node1 -> ['d'] -> node2
    
    *remove(1)
    
    START
        IF index < 0 || index >= size
            return null
        ELSE IF index == 0
            return removeFirst()
        ELSE iF index == size - 1
            return removeLast()
        ELSE 
            previous = head //set previous as head
            Iterate( <size ) previous = previous.next //loop until the node before the one being removed
            temp = previous.next //copy the head of the node being removed
            previous.next = temp.next //change new point from the previous.next to temp.next
            size--
            return temp.element //return the node being removed
          
    head:    tail:
    node1 -> node2
    
    Q2
    
    The name of the method is contains().
    
    public boolean contains(E e){
        
        Node<E> current = head;
    
        while(current.element != null){
            if(current.element == e){
                System.out.println(current.element);
                return true;
        }
        current.next;
   }
    return false;
 }
    
    Q3
    
    The name of the method is removeLast()
    
    public E removeLast(）{
        if（size == 0) return null;
        else if (size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else{
    
            Node<E> pointer1 = head;
            
            //Move to last 2nd node
            for(int i = 0; i < size - 2; i++){
                pointer1 = pointer1.next;
            }
            
            Node<E> temp = tail; //copy before deleted
            tail = pointer1; //current become tail
            tail.next = null; //current.next become null
            size--;
            return temp.element;
    }
  }
*/
}
