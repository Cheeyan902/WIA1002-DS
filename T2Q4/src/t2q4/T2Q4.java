package t2q4;

/* What is erasure? Why are Java generics implements using erasure?

Ans: Erasure is the approach where the compiler uses the generic type information to compile the code, but erases it afterwards, so the generic information is not available at run time.

This approach enables the generic code to be backward-compatible with the legacy code that uses raw types.
*/
