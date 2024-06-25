//            Programmer Name : Bryan Estrada
//           Assignment Start : 3/19/2024 2:00 pm
//      Assignment Completion : 3/22/2024 9:07 pm
// Total Hours for Assignment : 3 hours
//                   Comments : Something I liked about the assignment was the way I formatted my tabular table. I think
//                              is so easy to format output in Java.

import java.security.SecureRandom;         //SecureRandom class importation
import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class DiceRolling {
    public static void main(String[] args) {
        int[] sumsFrequency = new int[13];  //Array of counters for each sum of two dice

        for(int i = 0; i < 36_000_000; i++){
           ++sumsFrequency[rollDice()]; //Call rollDice() method and increment the sum total of rolling two dice
        }

        System.out.printf("%s%s%10s%n", "Sum", " |", "Frequency");  //Print table's heading

        //Print a line to divide heading with data
        for(int i = 0; i < 15; i++){
            System.out.print("-");
        }
        System.out.println(); //New line

        //Print results in the table
        for(int i = 2; i < sumsFrequency.length; i++){
            System.out.printf("%2d%s%10d%n", i, "  |", sumsFrequency[i]);
        }

        //Goodbye message
        System.out.println("\nThank you for using the Dice Rolling application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }
    //rollDice method simulates rolling two dice of six faces and returns the sum of the two dice's face up
    public static int rollDice(){
         SecureRandom randomNumbers = new SecureRandom();   //Object RandomNumbers
         int die1 = 1 + randomNumbers.nextInt(6);     //Roll die1
         int die2 = 1 + randomNumbers.nextInt(6);     //Roll die2

         return die1 + die2; //Return sum of the two dice's face up
    }
}