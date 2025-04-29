// import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        // int[][] students = {{40,50,45,67,99},{78,88,41,54,99}};
        // for(int i=0; i<students.length;i++){
        //     int sum =0;
        //     for(int j=0; j<students[i].length;j++){
        //         sum += students[i][j];
        //     }
        //    System.out.println("TotalSum of the students"+" : "+sum);
        //    System.out.println("Average of the students"+" : "+sum / students[i].length);
        //    System.out.println();
        //     }


        // int[] numbers = {12, 45, 67, 23, 89,45,77,123};
        // int great = numbers[0];
        // for(int i=0;i<numbers.length;i++){
        // if(numbers[i]>great){
        //     great = numbers[i];  
        // }
        // }
        // System.out.println("Greatest value among"+ " : " + great);


        // int[] num = {12,34,33,66,567};
        //    int evencount = 0;
        //     int oddcount = 0;
        //     for(int i=0; i<num.length;i++){
        //     if (num[i] % 2 == 0) {
        //         evencount++;
        //     } else {
        //         oddcount++;
        //     }
        // }
        // System.out.println("even count"+" : " + evencount);
        // System.out.println("even count"+" : " + oddcount);
    
    // int[] users = new int [10];
    // Scanner user = new Scanner (System.in);
    // System.out.println("Enter values: ");
    // int count = user.nextInt();
    // // user.nextLine();
    // for (int i = 0; i < count; i++) {
    //     System.out.print("Enter values " + (i + 1) + ": ");
    //     users[i] = user.nextInt();
    // }
    // Arrays.sort(users,0, count);
    // System.out.println("ssorted  values:");
    // for (int i = 0; i < count; i++) {
    //     // System.out.print(Arrays.sort(users));
    //     System.out.print(users[i] + " ");
    // }
    // user.close();
    
        // int[] arr = {1,2,5,7,9};
        // System.out.println("normal array:");
        // int i=0;
        // while(i<arr.length){
        //     System.out.print(arr[i] + " ");
        //     i++;
        // }
        // System.out.println();
        // System.out.println("Reverse array:");
        //  i = arr.length-1 ;
        // while( i >= 0 ) {
        //     System.out.print(arr[i] + " ");
        //     i--;
        // }

        // int[][] grade = {{44,55,77,88,99},{46,65,73,82,95},{42,55,75,82,91},{44,55,34,88,99},{44,59,77,68,99}};
        // for(int i=0;i<grade.length;i++){
        //     int count =0;
        // for(int j=0;j<grade[i].length;j++){    
        // }
    
//     int[] number = {133,234,22,2,6666};
//     for(int i=0; i<number.length;i++){
//                 int count =0;
//                 int value = number[i];
//                 while (value > 0) {
//                     value = value / 10;//main step
//                     count++;
//                 System.out.println(number[i] +" has "+count+" digits");
//     }
// }

// int n = 2;
// int count = 0;
// while(n >  0){
//     n = n/10;
//     count ++;
// }
// System.out.println(count);
String s3 = "you cannot change me";
final String s8 = " you cannot";
String s9 = s8 + " change me";
System.out.println(s3 == s8);

//DSA
// Scanner input =new Scanner(System.in);
// int a= input.nextInt();
// int b= input.nextInt();
// int c= input.nextInt();
//  int max =0;
//  if(a> b && a>c){
//     max = a;
//  }else if(b > max && b > c){
//     max = b;
//  }else{
//     max = c;
//  }
// System.out.println("maximum value"+" : "+ max);

// Scanner i = new Scanner(System.in);
// int a = i.nextInt();
// int b = i.nextInt();
// int c = i.nextInt();
// System.out.println("Max value"+" : "+Math.max(a, Math.max(b,c)));

// Scanner input = new Scanner(System.in);
// char letter = input.nextLine().trim().charAt(0);
// System.out.println(letter);

// Scanner input = new Scanner(System.in);
// char word = input.next().trim().charAt(1);
// if (word >= 'a' && word <= 'z') {
//     System.out.println("Lower case");
// } else {
//     System.out.println("Upper case");
// }

// Scanner input = new Scanner(System.in);
// int n = input.nextInt();
// int a=0;
// int b=1;
// // int count = 2;
// while ( b<=n) {
// System.out.println(b);
//     int temp = b;
//     b= b+a;
//     a = temp;
//     // count++;    
// }

        // int a = 0;
        // int b = 1;

        // System.out.println("Fibonacci numbers from 1 to 100:");
        
        // while (b <= 100) {
        //     System.out.println(b + " ");
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        // }

//


//      int[] list ={1,2,3,2,3,2,1,3,4,1,3,2,4,};
//      for(int i = 0;i < list.length;i++){
//         if(list[i]==-1){
//             continue;
//         }
//         int count = 1;

//      for(int j = i + 1;j < list.length;j++){
//         if(list[i]==list[j]){
//         count++;
//         list[j] = -1;
//      }
//      }
//      System.out.println( list[i]+" occurs "+count+" times ");
// }



// int a = 0;
// int b = 1;
// System.out.println("Fibonacci numbers from 1 to 100:");
// for (; b <= 100;) {
//     if (b <= 100) {
//         System.out.println(b + " ");
//     }
//     int temp = b;
//     b = b + a;
//     a = temp;
//     // System.out.println(b + " ");
//     }

    // int n=100;
    // int a = 0;
    // int b = 1;
    // System.out.println("Fibonacci numbers from 1 to 100:");
    // while(b<=n){
    //     System.out.println(b);
    //     int temp =b;
    //     b=b+a;
    //     a= temp;
    // }

    // int n = 455354;
    // int original=455354;
    //  int count = 0;
    //  while (n>0){
    //     int a= n%10;
    //     if(a == 5){
    //         count++;
    //     }
    //     n = n/10;
    //  }
    //  System.out.println("In  "+ original +" (5 occurs) "+count+" times");

    int n = 455354;
    int original=455354;
     int count = 0;
     while (n>0){
        int a= n%10;
        if(a == 5){
            count++;
        }
        n = n/10;
     }
     System.out.println("In  "+ original +" (5 occurs) "+count+" times");




}

}

        

