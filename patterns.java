import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
System.out.println("enter the nth value");
int value = t.nextInt();
t.nextLine();
        pattern1(value);
        // int evencount = 0;
        
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(10);
        // pattern5(4);
        // pattern6(4);
        // // pattern7(4);
    }
//     static void pattern1(int n){
//         for (int i = 1; i<=n; i++){
//         for (int j = 1; j<=n; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
//     //
//     static void pattern2(int n){
//         for (int i = 1; i<=n; i++){
//         for (int j = 1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
//     //
//     static void pattern3(int n){
//         for (int i = 4; i>=1; i--){
//         for (int j = 1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
//     //
   
//     static void pattern4(int n) {
//         int mid = (n + 1) / 2;
//         for (int i = 1; i <= n; i++) {
//             int a = i <= mid ? i : n - i + 1; 
//             for (int j = 1; j <= mid - a; j++) {
//                 System.out.print(" ");  
//             }
//             for (int j = 1; j <= 2 * a - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     //
//     static void pattern5(int n){
//         for (int i = 1; i<=n; i++){
//         for (int j = 1; j<=i; j++){
//             System.out.print(i);
//         }
//         System.out.println();
//     }
//     }
//     //
//     static void pattern6(int n){
//         for (int i = 1; i<=n; i++){
//         for (int j = 1; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
//     }
//     //
// //     static void pattern7(int n){
// //         for (int i = 1; i<=n; i++){
// //         for (int j = 1; j<=i; j++){
// //         for (int k = 1; k<=i; k++){

// //             System.out.print(k);
// //         }
//         System.out.println();
//     }
//     }
// }
 

static void pattern1(int value){
    for(int i=0; i<=value;i++){
        if(i%2==0){
            System.out.println("even" +  " : "+ i);
        }  else{
            System.out.println("odd"+ " : " + i);
        }
    }
    System.out.println();

}
}
