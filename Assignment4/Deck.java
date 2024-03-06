import java.util.*;

public class Deck {
    private static Vector<Card> deck;

    public Deck() {
        deck = new Vector<>(52);
    }

    public void createDeck() {
        try (Scanner input = new Scanner(System.in)) {
            for (int rank = 1; rank <= 13; rank++) {
                for (String suit : Card.suits) {
                    Card card = new Card(rank, suit);
                    deck.add(card);
                }
            }

            while (true) {
                System.out.println("***************************\n");
                System.out.println("1. Display the deck of cards");
                System.out.println("2. Shuffle the deck of cards");
                System.out.println("3. Draw a card from the deck");
                System.out.println("4. Empty the deck");
                System.out.println("5. Print a card from the deck");
                System.out.println("6. Compare two cards");
                System.out.println("7. Check if two cards are same");
                System.out.println("8. Find card by rank and suit");
                System.out.println("9. Deal a hand of cards");
                System.out.println("10. Quit");
                System.out.print("Enter your choice (1-10): ");
                int choice;
                try {
                    choice = input.nextInt();
                    System.out.println("Choice selected: " + choice); // Debugging statement
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    input.next(); // Consume invalid input
                    continue; // Go back to the start of the loop
                } catch (NoSuchElementException ex) {
                    System.out.println("No more input available.");
                    ex.printStackTrace(); // Print stack trace for debugging
                    break;
                }

                System.out.println("***************************\n");

                switch (choice) {
                    case 1:
                        displayDeck(deck);
                        break;
                    case 2:
                        shuffleDeck(deck);
                        break;
                    case 3:
                        drawCard();
                        break;
                    case 4:
                        emptyDeck();
                        break;
                    case 5:
                        drawCard(deck);
                        break;
                    case 6:
                        compareCard();
                        break;
                    case 7:
                        sameCard();
                        break;
                    case 8:
                        findCard();
                        break;
                    case 9:
                        dealCard(deck);
                        break;
                    case 10:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }

    public static void displayDeck(Vector<Card> deck) {
        System.out.println("Deck of Cards:");
        for (Card card : deck) {
            System.out.println(card);
        }
        System.out.println();
    }

    public static void shuffleDeck(Vector<Card> deck) {
        Collections.shuffle(deck);
        System.out.println("Deck Shuffled.");
    }

    public void drawCard() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty");
        } else {
            Card card = deck.remove(0);
            System.out.println("You drew: " + card);
        }
    }

    public void emptyDeck() {
        deck.clear();
        System.out.println("Deck is emptied.");
    }

    public static void drawCard(Vector<Card> deck) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the position of the card you want to draw: ");
            int position = input.nextInt();

            if (deck.isEmpty()) {
                System.out.println("Deck is empty.");
            } else {
                Card card = deck.get(position);
                System.out.println("You drew: " + card);
            }
        }
    }

    public void sameCard() {
        Random rand = new Random();
        int firstCard = rand.nextInt(52);
        int secondCard = rand.nextInt(52);

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            Card card1 = deck.get(firstCard);
            Card card2 = deck.get(secondCard);
            if (card1.getRank() == card2.getRank()) {
                System.out.println("You drew: " + card1 + " and " + card2 + " are same.");
            } else {
                System.out.println("You drew: " + card1 + " and " + card2 + " are not same.");
            }
        }
    }

    public static void compareCard() {
        Random rand = new Random();
        int firstCard = rand.nextInt(52);
        int secondCard = rand.nextInt(52);

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            Card card1 = deck.get(firstCard);
            Card card2 = deck.get(secondCard);
            if (card1.getRank() > card2.getRank()) {
                System.out.println("You drew " + card1 + " and " + card2 + " and " + card1 + " is of higher rank.");
            } else if (card1.getRank() < card2.getRank()) {
                System.out.println("You drew " + card1 + " and " + card2 + " and " + card2 + " is of higher rank.");
            } else {
                if (Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades").indexOf(card1.getSuit()) < Arrays
                        .asList("Hearts", "Diamonds", "Clubs", "Spades").indexOf(card2.getSuit())) {
                    System.out.println("You drew " + card1 + " and " + card2 + " and " + card1 + " is of higher rank.");
                } else {
                    System.out.println("You drew " + card1 + " and " + card2 + " and " + card2 + " is of higher rank.");
                }
            }
        }
    }

    public void sortCard() {
        deck.sort(new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                if (card1.getRank() == card2.getRank()) {
                    return card1.getSuit().compareTo(card2.getSuit());
                } else {
                    return card1.getRank() - card2.getRank();
                }
            }
        });
        System.out.println("Deck of cards:");
        for (Card card : deck) {
            System.out.print(card);
        }
        System.out.println();
    }

    public void findCard() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the rank of the card you want to find: ");
            int rank = input.nextInt();
            System.out.print("Enter the suit (\"Hearts\", \"Diamonds\", \"Clubs\", \"Spades\"): ");
            String suit = input.next();

            if (deck.isEmpty()) {
                System.out.println("Deck is empty.");
            } else {
                for (int i = 0; i < deck.size(); i++) {
                    Card card = deck.get(i);
                    if (card.getRank() == rank && card.getSuit().equals(suit)) {
                        System.out.println("Card found at position " + i);
                        break;
                    }
                }
            }
        }
    }

    public static void dealCard(Vector<Card> deck) {
        shuffleDeck(deck);
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of players: ");
            int players = input.nextInt();

            if (deck.isEmpty()) {
                System.out.println("Deck is empty.");
            } else {
                int cardsPerPlayer = deck.size() / players;
                int remainingCards = deck.size() % players;
                int start = 0;
                int end = cardsPerPlayer;
                for (int i = 0; i < players; i++) {
                    System.out.println("\nPlayer " + (i + 1) + " cards:");
                    for (int j = start; j < end; j++) {
                        System.out.println(deck.get(j));
                    }
                    start = end;
                    end += cardsPerPlayer;
                }
                if (remainingCards > 0) {
                    System.out.println("Remaining cards:");
                    for (int i = end; i < deck.size(); i++) {
                        System.out.println(deck.get(i));
                    }
                }
            }
        }
    }
}
