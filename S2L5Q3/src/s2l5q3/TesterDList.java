package s2l5q3;

public class TesterDList {

    public static void main(String[] args) {
      
        DList<Integer> list = new DList<>();
        
        list.addFirst(1);
        list.add(1,10);
        list.addLast(100);
        list.add(2,2);
        list.remove(3);
        System.out.println();
        
        list.traverseForward();
        list.traverseBackward();
        list.printSize();
        list.clearAll();
        System.out.println();
        list.printSize();
    }
    
}
