package dsa;
import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            String name ="";
            for(int j =1; j<=n-i; j++){
                 name +="";
            } 
            for(int j =1; j<=2*i-1; j++){
                 name +="*";
            } 
        System.out.println(name);//javac dsa/patterns.java
        }//java dsa.patterns
        sc.close();
    }
}
