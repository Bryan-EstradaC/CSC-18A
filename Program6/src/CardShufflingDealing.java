//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/20/2024 3:00 pm
//      Assignment Completion : 4/21/2024 1:00 pm
// Total Hours for Assignment : 10 hours
//                   Comments : The main function creates a deck, shuffles the card and deal a hand of five cards, then
//                              it contains methods that determine if the hand has a special combination of cards and
//                              prints what combination it is.

import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class CardShufflingDealing {
    // execute application
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();   //DeckOfCards' object to create a deck of 52 cards
        deck.shuffle();                         //Shuffle deck

        // Deal a hand
        Card[] hand = deck.dealHand();          //Card's object to deal a hand of five cards from the deck created

        //Print the hand
        System.out.println("Hand dealt:");
        for (Card card : hand) {
            System.out.print(card + "   ");
        }
        System.out.println();

        //Methods to determine what combination of cards the hand has
        if (deck.isFourOfAKind(hand)) {
            System.out.println("FOUR OF A KIND");
        }
        else if (deck.isFullHouse(hand)) {
            System.out.println("FULL HOUSE");
        }
        else if (deck.isFlush(hand)) {
            System.out.println("FLUSH");
        }
        else if (deck.isStraight(hand)) {
            System.out.println("STRAIGHT");
        }
        else if (deck.isThreeOfAKind(hand)) {
            System.out.println("THREE OF A KIND");
        }
        else if (deck.isTwoPairs(hand)) {
            System.out.println("TWO PAIRS");
        }
        else if (deck.isPair(hand)) {
            System.out.println("A PAIR");
        }
        else
            System.out.println("NO A GOOD HAND :(");

        //Goodbye message
        System.out.println("\nThank you for using the Card Shuffling and Dealing application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }
}
