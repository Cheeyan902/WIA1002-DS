package s2l8q1;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

public class S2L8Q1 {

    public static void main(String[] args) {
        
        Integer [] arr = {4,8,1,2,9,6,3,7};
        PriorityQueue<Integer> q = new PriorityQueue<>(Arrays.asList(arr));
        
        q.add(4);
        q.add(8);
        q.add(1);
        q.add(2);
        q.add(9);
        q.add(6);
        q.add(3);
        q.add(7);
        
        System.out.println(q.toString());
        System.out.println("First element (and remove):" + q.poll());
        Object[] array = q.toArray();
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("First element (and NOT remove):" + q.peek());
        System.out.println("Element 1 is inside the PQ:" + q.size());
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
        
        // Sorting the priority queue in reverse order
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: arr)
            pq2.add(num);
        System.out.println("Priority queue sorted in reverse order: " + pq2.toString());
    }
}
