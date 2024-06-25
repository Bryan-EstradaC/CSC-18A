//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/20/2024 3:00 pm
//      Assignment Completion : 4/21/2024 1:00 pm
// Total Hours for Assignment : 10 hours
//                   Comments : The modifications I did for this class were to methods and attributes to deal a hand of
//                              five cards and to determine if the hand dealt has a special combination of cards.

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private static final SecureRandom randomNumbers = new SecureRandom();   //Random number generator
    private static final int NUMBER_OF_CARDS = 52;                          //# of cards in a deck
    private Card[] deck = new Card[NUMBER_OF_CARDS];                        //Array of Cards to create deck
    private static final int HAND_SIZE = 5;                                 //# of cards in a hand
    private Card[] hand = new Card[HAND_SIZE];                              //Array of Cards to create a hand
    String[] facesValue = new String[HAND_SIZE];                            //Array to store faces' value
    private int currentCard = 0; // index of next Card to be dealt (0-51)   //Top card in the deck
    private final String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",     //Faces value
                                    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                                    "King"};
    private final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};   //Cards suits

    //Constructor fills deck of Cards
    public DeckOfCards() {
        //Populate deck with Card objects
        for(int count = 0; count<deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    //Shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        //Next call to method dealCard should start at deck[0] again
        currentCard = 0;
        //For each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            //Select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            //Swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
             }
         }

    //Deal one Card
    public Card dealCard() {
        //Determine whether Cards remain to be dealt
         if (currentCard < deck.length) {
             return deck[currentCard++]; //Return current Card in array
         } else {
             return null; //Return null to indicate that all Cards were dealt
         }
    }

    //Deal a hand of cards
    public Card[] dealHand() {
        //Deal HAND_SIZE number of cards
        for (int i = 0; i < HAND_SIZE; i++) {
            hand[i] = dealCard();
        }
        return hand;
    }

    //Method to determine the index of a card's face from the hand in the String[] faces array
    public static int findIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1; // Return -1 if the value is not found in the array
    }

    //Determine if the hand contains a pair
    public boolean isPair(Card[] hand) {
        for (int i = 0; i < HAND_SIZE; i++) {
            facesValue[i] = hand[i].getFace();
        }
        Arrays.sort(facesValue);
        int pairsCount = 0;
        for (int i = 0; i < HAND_SIZE - 1; i++) {
            if (facesValue[i].equals(facesValue[i + 1])) {
                pairsCount++;
                i++;
            }
        }
        return pairsCount == 1;
    }

    //Determine if the hand contains two pairs
    public boolean isTwoPairs(Card[] hand) {
        for (int i = 0; i < HAND_SIZE; i++) {
            facesValue[i] = hand[i].getFace();
        }
        Arrays.sort(facesValue);
        int pairsCount = 0;
        for (int i = 0; i < HAND_SIZE - 1; i++) {
            if (facesValue[i].equals(facesValue[i + 1])) {
                pairsCount++;
                i++;
            }
        }
        return pairsCount == 2;
    }

    //Determine if the hand contains three of a kind
    public boolean isThreeOfAKind(Card[] hand) {
        for (int i = 0; i < HAND_SIZE; i++) {
            facesValue[i] = hand[i].getFace();
        }
        Arrays.sort(facesValue);
        for (int i = 0; i < HAND_SIZE - 2; i++) {
            if (facesValue[i].equals(facesValue[i + 1]) && facesValue[i].equals(facesValue[i + 2])) {
                return true;
            }
        }
        return false;
    }

    //Determine if the hand contains four of a kind
    public boolean isFourOfAKind(Card[] hand) {
        for (int i = 0; i < HAND_SIZE; i++) {
            facesValue[i] = hand[i].getFace();
        }
        Arrays.sort(facesValue);
        for (int i = 0; i < HAND_SIZE - 3; i++) {
            if (facesValue[i].equals(facesValue[i + 1]) && facesValue[i].equals(facesValue[i + 2]) && facesValue[i].equals(facesValue[i + 3])) {
                return true;
            }
        }
        return false;
    }

    //Determine if the hand is a flush
    public boolean isFlush(Card[] hand) {
        String firstSuit = hand[0].getSuit();
        for (int i = 1; i < HAND_SIZE; i++) {
            if (!hand[i].getSuit().equals(firstSuit)) {
                return false;
            }
        }
        return true;
    }

    //Determine if the hand is a straight
    public boolean isStraight(Card[] hand) {
        int[] indices = new int[hand.length];
        for (int i = 0; i < hand.length; i++) {
            indices[i] = findIndex(faces, hand[i].getFace());
        }
        Arrays.sort(indices);
        for (int i = 0; i < HAND_SIZE - 1; i++) {
            if (indices[i] - indices[i + 1] != -1) {
                return false;
            }
        }
        return true;
    }

    //Determine if the hand is a full house
    public boolean isFullHouse(Card[] hand) {
        String[] faces = new String[HAND_SIZE];
        for (int i = 0; i < HAND_SIZE; i++) {
            faces[i] = hand[i].getFace();
        }
        Arrays.sort(faces);
        return (faces[0].equals(faces[1]) && faces[1].equals(faces[2]) && faces[3].equals(faces[4])) ||
                (faces[0].equals(faces[1]) && faces[2].equals(faces[3]) && faces[3].equals(faces[4]));
    }
}