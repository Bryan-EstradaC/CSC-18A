//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/20/2024 3:00 pm
//      Assignment Completion : 4/21/2024 1:00 pm
// Total Hours for Assignment : 10 hours
//                   Comments : The modifications I did for this class were to add the methods to get a card's face and
//                              card's suit.

public class Card {
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // initialize face of card
        this.suit = cardSuit; // initialize suit of card
        }
    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }

    //Getter for card's face value
    public String getFace (){
        return face;
    }

    //Getter for card's suit
    public String getSuit(){
        return suit;
    }

}
