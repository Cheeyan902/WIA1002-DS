/*package t6q1;

public class T6Q1 {

    public static void main(String[] args) {
    }
}

Q1
The stack method that returns an element from the stack without removing it is ___.
C. peek

Q2
            |-------|     |
            |  two  |
            |-------|
            |  one  |
|-------|   |-------|   |-------| 
    s1          s2          s3

Q3
Over time, the elements 1, 2, and 3 are pushed onto a stack in that order. For each of the following, indicate (yes or no) whether the sequence could be created by popping operations. If yes, list the sequence of push() and pop() operations that produces the sequence.
(a) 1-2-3 (b) 2-3-1 (c) 3-2-1 (d) 1-3-2

Ans: 
(a) 1-2-3, Yes
stack.push(1);
stack.push(2);
stack.push(3);

(b) 2-3-1, Yes
stack.pop();
stack.pop();
stack.pop();
stack.push(2);
stack.push(3);
stack.push(1);

(c) 3-2-1, Yes
stack.pop();
stack.pop();
stack.pop();
stack.push(3);
stack.push(2);
stack.push(1);

(d) 1-3-2, Yes
stack.pop();
stack.pop();
stack.push(3);
stack.push(2);

Q4
Convert the following infix expressions to postfix:

1.) a + b * c
2.) a * b – c/d
3.) a + (b*c + d)/e

Ans:
1.) a b c * +
2.) a b * c d / -
3.) a b c * d + e / +

Q5
Write the following expressions in infix form:

1.) a b + c *
2.) a b c + *

Ans:
1.) (a + b) * c
2.) a * (b + c)

Q6
Which of the following is an application of stack?

 a.) finding factorial
 b.) tower of Hanoi
 c.) infix to postfix
 d.) all of the above

Ans: d.)
*/