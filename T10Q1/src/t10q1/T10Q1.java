/*package t10q1;

Q1:
Explain the problem that occurs when executing the recursive method f(0).

public static int f(int n) {
    if (n == 1)
        return n;
    else
        return n * f(n-1);
}

Ans: The recursive method runs infinitely because the value of n will always be lower than the base case of n == 1, so it will cause 
the program's stack to continuously grow until it reaches a particular height and the StackOverflowError exception is initiated which crashes the program.

Q2: 
Explain the problem that occurs when executing the recursive method f().

public static int f(int n) {
    if (n == 0)
        return n;
    else
        return f(n+1) + n;
}

Ans: The problem occurs is the compile-time error. This happens because the method f() requires an integer parameter n but the function 
call does not pass in an integer argument. This error happens when the compiler expects the f() method call to accept exactly one integer parameter 
but the argument is not provided.

Q3:
Write a recursive method to reverse a string.

String → gnirts

Ans: 


*/
