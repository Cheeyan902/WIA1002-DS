/*package t7q1;
public class T7Q1 {
    public static void main(String[] args) {   
    }  
}

Q1: Name four everyday examples of a queue other than those discussed during lecture.

Ans: Canteen waiting lane, Vehicle traffic on roadlane, music playlist

Q2: What is the difference between a queue and stack?

Ans: Queue implements the FIFO (First In First Out) order where the element that gets removed first is the first element that enters the queue.

Stack implements the LIFO (Last In First Out) order where the element that gets removed first is the last element that entered the stack.

Q3: 

Use the following code segment to answer parts (1) through (3):

Queue<Integer> q = new Queue<Integer>();
Scanner keyIn = new Scanner(System.in);
for (int i = 1; i <= 5; i++) {
    if (keyIn.nextBoolean())
        System.out.print(i + " ");
    else
        q.enqueue(i);
}
while (!q.isEmpty())
    System.out.print(q.dequeue() + " ");

System.out.println();

1.) What is the output for the following input sequence?

    true false false true true

2.) Is it possible to have output: 1 3 5 4 2? If yes, give an input sequence that produces the output; or else, provide justification to your answer.

3.) Give at least three input sequences that produce the output: 1 2 3 4 5

Ans: 
Part 1: 1 4 5 2 3

Part 2: Impossible as 2 is before 4

Part 3: 

Input 1: true true true true true
Input 2: false false false false false
Input 3: true true true true false

Q4:

a.) X.front()
Ans: 5

b.) Y = X.dequeue();
X.enqueue(new Integer(10));
X.front();
Ans: 7

c.) Y = X.dequeue();
Ans: 7

d.) X.front()
Ans: 9

Q5: Provide and explain three operations / functions of LinkedList-based Queue that you can add to the GenericQueue class, other than those discussed in the lecture (i.e., enqueue, dequeue and getSize – from Slide 10 in the lecture slide).

Ans:
clear() - clear the queue
front() - retrieve the front of the queue
isEmpty() - returns a boolean value to check if the queue is empty
peek() - retrieve but do not dequeue the first element in the queue
*/