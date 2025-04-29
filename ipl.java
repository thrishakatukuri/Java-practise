import java.util.Scanner;

public class ipl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your teamName: ");
        String teamName = sc.nextLine();

        System.out.println("Enter number of players: ");
        int playersTotal = sc.nextInt();
        sc.nextLine(); 

        // System.out.println("Enter number of balls faced: ");
        // int balls = sc.nextInt();
        // sc.nextLine(); 
        // System.out.println("Enter number of runs scored: ");
        // int runs = sc.nextInt();
        // sc.nextLine(); 
        // System.out.println("Enter strike rate: ");
        // int strikeRate = sc.nextInt();
        // sc.nextLine(); 
        // System.out.println("\n--- Team Summary ---");
        // System.out.println("Team Name: " + teamName);
        // System.out.println("Number of Players: " + players);
        // System.out.println("Balls Faced: " + balls);
        // System.out.println("Runs Scored: " + runs);
        // System.out.println("Strike Rate: " + strikeRate);

        String[] names = new String[playersTotal];
        int[] facedBalls = new int[playersTotal];
        int[] runs = new int[playersTotal];
        double[] strikeRate = new double[playersTotal];

        for (int i = 0; i < playersTotal; i++) {
            System.out.print("\nEnter details for Player" + i+1 + ";");

            System.out.print("Name: ");
            names[i] = sc.nextLine();
           
            System.out.print("Balls faced: ");
            facedBalls[i] = sc.nextInt();

            System.out.print("Runs scored: ");
            runs[i] = sc.nextInt();

            sc.nextLine();

            if (facedBalls[i] != 0) {
                strikeRate[i] = ((double) runs[i] / facedBalls[i]) * 100;
            } else {
                strikeRate[i] = 0;
            }
        }

        System.out.println("-----------------------------------"+ teamName +"---------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "PlayerName", "Balls", "Runs", "Strike Rate");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < playersTotal; i++) {
            System.out.printf("%-20s %-10d %-10d %-10.1f\n", names[i], facedBalls[i], runs[i], strikeRate[i]);
        }
        System.out.println("---------------------------------------------------------------------------------");

        int totalScore = 0;
        int topScore = 0;
        String topScorer = "";
        
       for (int i = 0; i < playersTotal; i++) {
           totalScore += runs[i];

           if (runs[i] > topScore) {
            topScore = runs[i];
            topScorer += names[i];
        }
       }
       System.out.println("Total Score: " + totalScore);
       System.out.println("TopScorer: " + topScore +"by"+ topScorer);


      

       
    sc.close(); 
}
}
