package t1q3;

public class C {
    public static void main(String[] args) {
        Object [] o = {new A(), new B()};
        System.out.print(o[0]);
        System.out.print(o[1]);
    }
}

class A extends B {
    public String toString(){
        return "A";
    }
}

class B{
    public String toString(){
        return "B";
    }
}


// ans: AB, The value A overrides B when A is called, while B is kept as B when B is called.
