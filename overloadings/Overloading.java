package overloadings;

public class Overloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.m(new Child2());
    }

    void m(Child2 obj1) {
        obj1.m1(1012345l);
        obj1.m1(10);
        obj1.m1("thrisha");
        obj1.m1(30.123f);
        obj1.m2(40);
        System.out.println("i'm void method");
    }
}

class Parent {
    void m1(long a) {
        System.out.println("Parent : " + a);
    }
    
}

class Child1 extends Parent {
    void m1(String a) {
        System.out.println("Child-1 : " + a);
    }
}

class Child2 extends Child1 {
    void m1(float a) {
        System.out.println("Child-2-1 : " + a);
    }
     void m1(int a) {
        System.out.println("Child-2-1a : " + a);
    }
     void m2(int a) {
        System.out.println("Child-2-2 : " + a);
    }
}
