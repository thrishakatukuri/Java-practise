package tasks;

import java.util.Arrays;

public class student {
    public static void main(String[] args) {
        student obj = new student();
        obj.displayinfo1("thrisha", 21, 84.00);
        obj.displayinfo2("katukuri", 22, 77.00);
        obj.displayinfo3();
        obj.arrays2d();
        obj.arrays2D();
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

     void arrays2d() {
        int arr[][]= new int[3][4];
        arr[0][0]  =  1;
        arr[0][1]  =  2;
        arr[0][2]  =  3;
        arr[0][3]  =  4;
       
        arr[1][0]  =  5;
        arr[1][1]  =  6;
        arr[1][2]  =  7;
        arr[1][3]  =  8;
       
        arr[2][0]  =  9;
        arr[2][1]  =  9;
        arr[2][2]  =  9;
        arr[2][3]  =  10;
        System.out.println(Arrays.deepToString(arr));
    }

     void arrays2D() {
        int arr[][]= new int[3][4];
        arr[0][0]  =  1;
        arr[0][1]  =  2;
        arr[0][2]  =  3;
        arr[0][3]  =  4;
       
        arr[1][0]  =  5;
        arr[1][1]  =  6;
        arr[1][2]  =  7;
        arr[1][3]  =  8;
       
        arr[2][0]  =  9;
        arr[2][1]  =  10;
        arr[2][2]  =  11;
        arr[2][3]  =  12;
        // System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<3;i++){
           for(int j=0;j<4;j++){
            System.out.print((arr[i][j])*2 + " ");
        }  
        System.out.println();
        }
    }

}
