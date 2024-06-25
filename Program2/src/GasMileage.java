//            Programmer Name : Bryan Estrada
//           Assignment Start : 3/1/2024 4:00 pm
//      Assignment Completion : 3/1/2024 9:42 pm
// Total Hours for Assignment : 5 hours
//                   Comments : Something I liked about the assignment was the way I arranged the output. I tried not
//                              only to make the code readable, but also the output by separating the results for each
//                              trip. One thing I would do different is to print the output as a table with a header to
//                              print the results for each trip.

import java.util.Scanner;                  //Scanner class importation
import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counterTrips = 0;   //Counter for number of trips
        int miles = 0;          //Amount of miles in a trip
        int milesTotal = 0;     //Miles total
        int gallonsTotal = 0;   //Gallons total
        float mpg;              //Miles per gallons in a trip
        float mpgTotal = 0;     //Miles per gallons total

        while(miles != -1) {                    //Sentinel to exit the loop
            System.out.print("Enter miles driven (Enter -1 to exit): ");
            miles = input.nextInt();            //Input amount of miles in a trip
            if(miles != -1){                    //If user did not enter -1, do calculations
                milesTotal += miles;            //Update milesTotal
                counterTrips++;                 //Increment by 1 counterTrips
                System.out.print("Enter gallons used: ");
                int gallons = input.nextInt();  //Input amount of gallons in a trip
                gallonsTotal += gallons;        //Update gallonsTotal

                mpg = (float)miles / gallons;                                       //Calculate mpg in a trip
                System.out.printf("MPG for trip #%d: %.2f%n", counterTrips, mpg);   //Print results for a trip

                mpgTotal = (float) milesTotal / gallonsTotal;       //Calculate mpgTotal
                System.out.printf("MPG so far: %.2f%n", mpgTotal);  //Print mpgTotal
                }
            System.out.println();   //Leave an empty line in the console
        }

        if(milesTotal != 0) {   //If user entered information, then print results
            System.out.printf("Total number of trips: %d%n", counterTrips);
            System.out.printf("Total miles driven: %d%n", milesTotal);
            System.out.printf("Total gallons used: %d%n", gallonsTotal);
            System.out.printf("Total MPG: %.2f%n", mpgTotal);
        }
        else{   //If user did not enter information, then print message
            System.out.println("No information was entered");
        }

        //Goodbye message
        System.out.println("\nThank you for using the Gas Mileage application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));
    }
}