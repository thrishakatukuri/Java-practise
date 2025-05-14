package overridding;

public class Overridding {
    public static void main(String[] args) {
        Overridding obj = new Overridding();
        obj.m1(new Math(), 1234);

        Child2 obj2 = new Child2();
        obj2.marry();
        obj2.marry(0);
        obj2.marry(new int[]{1, 2, 3}); // array is a reference type


    }

    void m1(Math obj1, long c) {
        obj1.sound1("thrisha");
        obj1.sound1(10, 20);
        System.out.println("long : " + c);
    }
}

class Animal {
    String sound1(String a) {
        return null;
    }
}

class Dog extends Animal {
    String sound1(String a) {
        System.out.println("dog extends : " + a);
        return null;
    }
}

class Lion extends Dog {
    String sound1(String a) {
        System.out.println("Lion extends : " + a);
        return null;
    }
}

class Math extends Lion {
    int sound1(int a, int b) {
        System.out.println("Lion extends : " + (a - b));
        return a + b;
    }
}

class Marriage {
    void property() {// void doent return anything(dataypes,classnames,objectnames)
        System.out.println("cash+gold+land");
    }

    void marry() {
        System.out.println("subbalaxmi");// overridden
    }
}

 class Child extends Marriage {
    void marry() {
        System.out.println("laxmi");// overridding
    }
}

class Child2 extends Child{
    void marry(Object x) {
        System.out.println("lax : "+x);// overridding
    }
}