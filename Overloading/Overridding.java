package Overloading;

public class Overridding {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m2((byte) 129, (byte) 127);
        short a = 123;
        short b = 124;
        obj.m2(a, b);
        obj.m2(11234, 123456);
        obj.m2(20, 12);
        obj.m2(21, '0');
        obj.m2(234567l, 't');
        obj.m2(12.0f, 15.0f);
        obj.m2(12.0, 15.0);
        obj.m2("hi", 20);
        obj.m2('v', 't');
        obj.m2("hi", "hey");

       
    }
}

class Parent {
    void m2(byte a, byte b) {
        System.out.println("byte :" + a + " " + b);
    }

    void m2(short a, short b) {
        System.out.println("short :" + a + " " + b);
    }

    void m2(int a, int b) {// int - short,byte,char not possible
        System.out.println("int :" + a + " " + b);
    }

    void m2(long a, long b) {
        System.out.println("long :" + a + " " + b);
    }

    void m2(float a, float b) {
        System.out.println("float :" + a + " " + b);
    }

    void m2(double a, double b) {
        System.out.println("double :" + a + " " + b);
    }

    void m2(boolean a, boolean b) {
        System.out.println("boolean :" + a + " " + b);
    }

    void m2(char a, char b) {
        System.out.println("char :" + a + " " + b);
    }

    void m2(String a, int b) {
        System.out.println("string-int :" + a + " " + b);
    }

    void m2(String a, String b) {
        System.out.println("string :" + a + " " + b);
    }
}

