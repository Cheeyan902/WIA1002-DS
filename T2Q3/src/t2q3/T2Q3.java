package t2q3;

/*What is a raw type? Why is a raw type unsafe? Why is the raw type allowed in Java?

Ans : A raw type is the use of a generic class or interface without specifying a type parameter.

Raw type is unsafe because it allows input of data types different than intended which may cause type safety issues.

Before Java 5, collections and other classes that worked with groups of objects did not use generics. When generic were introduced, the raw types allowed developers to use these older classes without updating them to use generics.*/