// import java.util.Scanner;

// public class ipl1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int score = 0, wickets = 0, runs = 0;
//         int totalOvers = 3;

//         System.out.print("Enter number of players (max 5): ");
//         int totalPlayers = sc.nextInt();
//         sc.nextLine();

//         String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "";

//         System.out.println("Enter player names:");
//         if (totalPlayers >= 1) p1 = sc.nextLine();
//         if (totalPlayers >= 2) p2 = sc.nextLine();
//         if (totalPlayers >= 3) p3 = sc.nextLine();
//         if (totalPlayers >= 4) p4 = sc.nextLine();
//         if (totalPlayers >= 5) p5 = sc.nextLine();

//         System.out.print("Enter target score: ");
//         int target = sc.nextInt();
//         sc.nextLine();

//         for (int currentOver = 1; currentOver <= totalOvers ; currentOver++) {
           
//             System.out.println("\n--- Over " + currentOver + " ---");
//             System.out.print("Enter bowler name: ");
//             String bowler = sc.nextLine();

//             for (int ball = 1; ball <= 6; ball++) {
//                 if (score >= target || wickets >= totalPlayers - 1) {
//                     break;
//                 }

//                 System.out.print("Ball " + ball + " on strike. Enter runs or 'W': ");
//                 String data = sc.next();
//                 score += runs;
//             }
//             sc.nextLine(); 
//         }

//         System.out.println("\nFinal Score: " + score + "/" + wickets);
        
//         if (score >= target) {
//             System.out.println("won the match!");
//         } else {
//             System.out.println("lost the match!");
//         }

//         sc.close();
//     }
// }
