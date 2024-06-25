//Programmer Name: Bryan Estrada
//Assignment Start: 02/23/2024
//Assignment Completion: 02/23/2024
//Total Hours for Assignment: 2 hours
/*Comments: Something I would do different in this code is to use a function
            to solve the square of the radius, but I didn't, because I want
            to follow the pace of the class. Also, I would like to learn more
            about formatting and make my code cleaner by formatting the time
            and date and the number of decimals of the float variables.*/

import java.util.Scanner; //Scanner class importation
import java.time.LocalDateTime; //LocalDateTime class importation

public class Main {
    public static void main(String[] args) {    //Function main
        Scanner input = new Scanner(System.in); //Create Scanner object to read input from the user

        System.out.print("Enter the radius of the circle: ");   //Prompt
        int radius = input.nextInt();   //Store values to the circle's radius

        //Compute circle's diameter, area and circumference
        System.out.printf("The diameter of the circle is: %d%n", radius * 2);
        System.out.printf("The area of the circle is: %f%n", 2 * radius * Math.PI * Math.PI);
        System.out.printf("The circumference of the circle is: %f%n%n", 2 * Math.PI * radius);
        System.out.println("Thank you for using the DCA of a Circle application.");
        System.out.print("Time of calculation is ");
        System.out.print(LocalDateTime.now());  //Print current date and time of execution

        System.exit(0); //Exit program
    }
}