package tasks;

import java.util.Arrays;

public class student {
    public static void main(String[] args) {
        student obj = new student();
        obj.displayinfo1("thrisha", 21, 84.00);
        obj.displayinfo2("katukuri", 22, 77.00);
        obj.displayinfo3();
    }

    void displayinfo1(String name, int age, double grade) {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    void displayinfo2(String name, int age, double grade) {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    void displayinfo3() {
        int arr[]= new int[10];
        arr[0]  =  1;
        arr[1]  =  2;
        arr[2]  =  3;
        arr[3]  =  4;
        arr[4]  =  5;
        arr[5]  =  6;
        arr[6]  =  7;
        arr[7]  =  8;
        arr[8]  =  9;
        arr[9]  =  10;
        System.out.println(Arrays.toString(arr));
    }

}
