package t2q10;

/* When the compiler encounters a generic class, interface, or method with a bound type parameter, such as <T extends Number> or <E extends Comparable>, it replaces all occurrences of the type parameter with what type?

Ans: Bounded type/ Bound that is applied to parameters. 
For example, Here, the type parameter T is bounded by Number, so the compiler enforces that only types that are subtypes of Number can be used as the type parameter. 
When the code is used, the user can specify any subtype of Number they want to use: MyList<Integer> intList = new MyList<>(new Integer[] {1, 2, 3});
In this example, T is replaced with Integer, because the user specified Integer as the type parameter when creating the MyList instance. The compiler enforces that T must be a subtype of Number,
so only classes that extend Number can be used as the type parameter. 

*/