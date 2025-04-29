// import java.util.Scanner;

// public class day {
//     public static void main(String[] args) {
//         Scanner t = new Scanner(System.in);
//         System.out.println("Enter the nth value:");
//         int value = t.nextInt();
//         t.nextLine();

//         pattern1(value);
//     }

//     static void pattern1(int value) {
//         int evencount = 0;
//         int oddcount = 0;
//         int evensum = 0;
//         int oddsum = 0;

//         for (int i = 0; i <= value; i++) {
//             if (i % 2 == 0) {
//                 evencount++;
//                 evensum += i;
//                 System.out.println("Even: " + i);
//             } else {
//                 oddcount++;
//                 oddsum += i;
//                 System.out.println("Odd: " + i);
//             }
//         }

//         System.out.println("Even Count: " + evencount);
//         System.out.println("Odd Count: " + oddcount);
//         System.err.println("-------------------------------------------");
//         System.out.println("Even Sum of the given values: " + evensum);
//         System.out.println("Odd Sum: " + oddsum);
//     }
// }


import java.util.Scanner;

public class day{
        public static void main(String[] args) {

            Scanner t = new Scanner(System.in);
            System.out.print("Enter the number of people below 3: ");
            int value = t.nextInt();

            int[] num = new int[value];
            for (int i = 0; i < num.length; i++) {
                System.out.print("Enter value for person " + (i+1) + ": ");
                // System.out.print("value");
                num[i] = t.nextInt();
                t.nextLine();
            }
            // pattern1(num[1], num[2], num[3]);
            pattern1(num[0], num[1], num[2]);

        }
    
        
        static void pattern1(int a, int b, int c) {
            if (a >= b&&  a>=c) {
             if ((a >= b && a <= c) || (a <= b && a >= c)) {
             System.out.println("a value is 2ndgreater");
           } 
           System.out.println("a value is greater");
        }
         else if (b >= a && b >=c ) {
            if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("b value is 2ndgreater");
        }}
         else {
            System.out.println("c value is greater");
        }
        System.out.println("b value is greater");

    }

}
