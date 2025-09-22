import java.util.Scanner;

public class CardDeckProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributed);
        
        scanner.close();
    }
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }
    
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0];
        }
        
        String[][] distributed = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                distributed[player][card] = deck[cardIndex];
                cardIndex++;
            }
        }
        
        return distributed;
    }
    
    public static void printPlayersCards(String[][] distributed) {
        System.out.println("\nCard Distribution:");
        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < distributed[i].length; j++) {
                System.out.println("  " + distributed[i][j]);
            }
            System.out.println();
        }
    }
}