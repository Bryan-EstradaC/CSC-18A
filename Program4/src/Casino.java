//            Programmer Name : Bryan Estrada
//           Assignment Start : 3/13/2024 4:00 pm
//      Assignment Completion : 3/15/2024 9:42 pm
// Total Hours for Assignment : 6 hours
//                   Comments : To modify the book example, my first approach was to create a loop that will ask the
//                              user if he or she wants to play Craps, the user has to enter 'y' for yes or 'n' for no.
//                              Since we haven't learned how to enter char data types, I found out in internet that for
//                              entering char with Scanner class, we also have to use a String class method called
//                              charAt(), which it returns the char from the string at location in the parameter. Also,
//                              for my chatter function, I made up my own messages which are chosen randomly by
//                              SecureRandom class and method.

import java.security.SecureRandom;  //Import SecureRandom class
import java.util.Scanner;           //Import Scanner class
import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

//Begin Casino class
public class Casino {
    private static final SecureRandom randomNumbers = new SecureRandom();   //Object randomNumbers
    private enum Status {CONTINUE, WON, LOST};                              //Enum type representing game status
    private static final int SNAKE_EYES = 2;                                //Points to lose game in 1st thrown
    private static final int TREY = 3;
    private static final int BOX_CARS = 12;
    private static final int SEVEN = 7;                                     //Points to win game in 1st thrown
    private static final int YO_LEVEN = 11;

    //Begin main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input object to receive entered-date from user

        int bankBalance = 1_000;    //Initial bank balance for user
        int myPoint = 0;            //Sum of point in each thrown
        char choice;                //choice to ask user to play the game or not
        Status gameStatus;          //Contains Status' constants

        //Loop to ask the user to play the game or not
        do {
            System.out.print("Do you want to play Craps? (y/n) ");
            choice = input.next().charAt(0);    //Receive user's choice

            //If user chose yes
            if (choice == 'y') {
                printChatter();                         //Call printChatter method to print a random chatter
                int wager = enterWager(bankBalance);    //Assign a value to wager by calling enterWager() method
                int sumOfDice = rollDice();             //Get points from dice by calling rollDice() method

                //Switch statement to determine game status after 1st thrown
                switch (sumOfDice) {
                    case SEVEN:
                    case YO_LEVEN:
                        gameStatus = Status.WON;                        //User wins if dice sum up 7 or 11 points
                        bankBalance += wager;                           //Update bankBalance according to wager
                        break;
                    case SNAKE_EYES:
                    case TREY:
                    case BOX_CARS:
                        gameStatus = Status.LOST;                       //User loses if dice sum up 2, 3 or 12 points
                        bankBalance -= wager;                           //Update bankBalance according to wager
                        break;
                    default:
                        gameStatus = Status.CONTINUE;                   //Keep playing if no win or loss in 1st thrown
                        myPoint = sumOfDice;                            //Assign sumOfDice to myPoint
                        System.out.printf("Point is %d%n", myPoint);    //Print myPoint
                        break;
                }

                //Loop to keep rolling dice until user wins or loses after 1st thrown
                while (gameStatus == Status.CONTINUE) {
                    sumOfDice = rollDice();             //Roll dice

                    if (sumOfDice == myPoint) {         //User wins if dice sum up same points from 1st thrown
                        gameStatus = Status.WON;
                        bankBalance += wager;           //Update bankBalance according to wager
                    } else {
                        if (sumOfDice == SEVEN) {       //User loses if dice sum up 7 points
                            gameStatus = Status.LOST;
                            bankBalance -= wager;       //Update bankBalance according to wager
                        }
                    }
                }

                //Print a message depending on the user's result
                if (gameStatus == Status.WON) {
                    System.out.println("Player wins");
                } else {
                    System.out.println("Player loses");
                }

                if(bankBalance !=0){    //If bankBalance is not zero, then print bankbalance
                    System.out.printf("Bank balance is: $%d%n%n", bankBalance);
                }
            }
        }while(choice == 'y' && bankBalance != 0);  //do-while loop condition

        //Print final bankBalance and chatters depending on bankBalance value
        System.out.printf("\nBank balance is: $%d%n", bankBalance);
        if(bankBalance == 0){
            System.out.println("Sorry, you busted!");
        } else{
            System.out.println("You're up big. Now's the time to cash in your chips!");
        }

        //Goodbye message
        System.out.println("\nThank you for using the Casino application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0); //Exit program
    }

    //Method to roll two dice
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);    //Assign a random value from 1 to 6 to die1
        int die2 = 1 + randomNumbers.nextInt(6);    //Assign a random value from 1 to 6 to die2

        int sum = die1 + die2;  //Add up dice points

        //Print dice points and total
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum; //Return total points
    }

    public static int enterWager(int balance) {
        Scanner input = new Scanner(System.in);
        int wager;
        do {
            System.out.print("Enter your wager: $");
            wager = input.nextInt();

            if (wager > balance) {
                System.out.println("\nYour wager must be less than or equal the amount in your bank account");
                System.out.printf("Your balance is: $%d%n%n", balance);
            }
        }while (wager > balance);

        return wager;
    }

    //Method to print random chatter if user wants to play one more time
    public static void printChatter() {
        int key = 1 + randomNumbers.nextInt(3); //Get a random number from 1 to 3

        //Switch statement to choose chatter according to key value
        switch (key){
            case 1:
                System.out.println("You're going for broke");
                break;
            case 2:
                System.out.println("You're making smart moves.");
                break;
            case 3:
                System.out.println("You're tempting fate");
                break;
        }
    }
}