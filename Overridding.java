public class Overridding {
    public static void main(String[] args) {
    //    Overridding obj = new Overridding();
       Child obj = new Child();
       obj.m1();
    }
}
class Parent {
    void m1(int a, int b){
        System.out.println("hello world!");
    }
     void m1(String a,int b){
        System.out.println("hello world!");
    }
}
class Child {
    void m1(){
        System.out.println("world!");
    }
}
