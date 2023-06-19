package s2labtestq3;

import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> abc = new LinkedList<>();
        Integer[] ab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < ab.length; i++) {
            abc.add(ab[i]);
        }

        System.out.println("Original Queue: " + abc);
        System.out.println("Reverse Queue: " + reverse(3, abc)); //case k = 3
    }

    public static Queue<Integer> reverse(int k, Queue<Integer> queue) {

        Queue<Integer> reversedQueue = new LinkedList<>();
        Integer[] temp = new Integer[k];

        for (int i = 0; i < k; i++) {
            temp[i] = queue.poll();
        }

        for (int i = k - 1; i >= 0; i--) {
            reversedQueue.add(temp[i]);
        }

        while (!queue.isEmpty()) {
            reversedQueue.add(queue.poll());
        }

        return reversedQueue;
    }
}

