public class Day2 {
    public static void main(String[] args) {
        Day2 obj = new Day2();
        obj.add(10,20);
        obj.add("hi",20);
        obj.add(10,"hi");
        obj.add("hi","hello");

        C obj1 = new C();
        obj1.sub();
        obj1.mult();
        obj1.div();

        obj.add1(new AA());
        obj.add1(new BB());
        obj.add1(new CC());

        //13-05-2025
        child mrg = new child();
        mrg.marry();
        Marriage m = new Marriage();
        m.marry();
        Marriage m1 = new child();
        m1.marry();//if absence of marry method in child then parent prints,
        //if absence in parent and presence in child  then error
        // run time error
    }

void add(int a, int b){
    System.out.println("integer : "+ (a+b));}
void add(String a, int b){
    System.out.println("String-integer : "+ (a+b));}
void add(int a, String b){
    System.out.println("integer-String : "+ (a+b));}   
void add(String a, String b){
    System.out.println("String : "+ (a+b));} 

void add1(AA obj2){
    obj2.m1();
    System.out.println("hi");}
void add1(BB obj3){
    obj3.m1();
    System.out.println("hai");}
void add1(CC obj4){
    obj4.m1();
    System.out.println("hello");}}

// 
class A{
    void sub(){
    System.out.println("Strings : A");}}
class B extends A{
    void mult(){
    System.out.println("Strings : B");}}
class C extends B{
    void div(){
    System.out.println("Strings : C");}}
// 
class AA{
    void m1(){
    System.out.println("Strings : AA");}}
class BB extends AA{
    void m1(){
    System.out.println("Strings : BB");}}
class CC extends BB{
    void m1(){
    System.out.println("Strings : CC");}}

    //13-05-2025
class Marriage{
void property(){//void doent return anything(dataypes,classnames,objectnames)
    System.out.println("cash+gold+land");
}
void marry(){
    System.out.println("subbalaxmi");
}
}   
class child extends Marriage{
    void marry(){
    System.out.println("laxmi");
}
} 
//abstarct class
abstract class p {
    public abstract void m10();
}
abstract class p1 {
    public abstract void m10();
}//override
abstract class p2 {
    public abstract void m10();//declaration is psble
}
class p3{
    public void m10(){
    }
}//(override) same method and no implimentations are done
class p4{
    final void m10(){
    }}
    // class p5 extend p4{
    // public void m10(){
    // }//override
    class p6{
    protected void m11(){
    }}
    class p7 extends p6{
     public void m10(){
    //  default void m10(){//notposible
    //  private void m10(){


     }//posible
    }