import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of games to play: ");
        int games = scanner.nextInt();
        
        String[][] gameResults = new String[games][4];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.println("\nGame " + (i + 1) + ":");
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            String result = determineWinner(userChoice, computerChoice);
            
            if (result.equals("User")) userWins++;
            if (result.equals("Computer")) computerWins++;
            
            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = result;
        }
        
        displayGameResults(gameResults, userWins, computerWins, games);
        scanner.close();
    }
    
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int)(Math.random() * 3);
        return choices[randomIndex];
    }
    
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Tie";
        
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        
        return "Computer";
    }
    
    public static void displayGameResults(String[][] results, int userWins, int computerWins, int totalGames) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----\t----\t-------\t------");
        
        for (String[] game : results) {
            System.out.println(game[0] + "\t" + game[1] + "\t" + game[2] + "\t\t" + game[3]);
        }
        
        double userPercentage = (double) userWins / totalGames * 100;
        double computerPercentage = (double) computerWins / totalGames * 100;
        
        System.out.println("\nStatistics:");
        System.out.println("User wins: " + userWins + " (" + String.format("%.1f", userPercentage) + "%)");
        System.out.println("Computer wins: " + computerWins + " (" + String.format("%.1f", computerPercentage) + "%)");
        System.out.println("Ties: " + (totalGames - userWins - computerWins));
    }
}