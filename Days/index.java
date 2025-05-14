package Days;
import java.util.Scanner;
public class index {
public static void main (String[] args){
    Car myCar = new Car();//object creation of "Car class"
    myCar.brand = "bmw ";
    myCar.speed = 120;
    myCar.m1();

    Age  result = new Age();
    Scanner src = new Scanner(System.in);
    System.out.print("Enter any Age : ");
    int     age = src.nextInt();

    result.age = age;
    result.m2();
    src.close();
}}//end of main method
    class Car{//new class creation using Car constructor
    String brand;//instance variable
    int speed;//instance variable

    void m1(){//method
        System.out.println(brand + speed);
    }//end of method

}//end of new class

class Age{
    int age;
    void m2(){
        if(age>=18){
            System.out.println("major");
        }else{
            System.out.println("minor");
        }
    }
}



