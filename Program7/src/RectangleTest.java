//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/26/2024 6:00 pm
//      Assignment Completion : 4/27/2024 12:42 am
// Total Hours for Assignment : 6 hours
//                   Comments : The main test creates a Rectangle object and pass non-arguments to the constructor where
//                              its length and width are set to 1.0 foot as default values. After that, the user has to
//                              enter the actual length and width values and the program calculates the rectangle's area
//                              and perimeter.

import java.util.Scanner;                  //Scanner class importation
import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle(); //Create a Rectangle object
        float length;   //Variable to store rectangle's length
        float width;    //Variable to store rectangle's width

        //Enter rectangle's length
        do{
            System.out.print("Enter rectangle's length in square feet: ");
            length = input.nextFloat();
            //Attempt to set rectangle's length
            try{
                rectangle1.setLength(length);
            }
            catch(IllegalArgumentException e){  //Catch exception if length is invalid
                System.out.printf("%nException while setting rectangle length: %s%n", e.getMessage());
            }
        }while (length <= 0 || length >= 20);

        //Enter rectangle's width
        do{
            System.out.print("Enter rectangle's width in square feet: ");
            width = input.nextFloat();
            //Attempt to set rectangle's width
            try{
                rectangle1.setWidth(width);
            }
            catch(IllegalArgumentException e){  //Catch exception if width is invalid
                System.out.printf("%nException while setting rectangle width: %s%n", e.getMessage());
            }
        }while(width <= 0 || width >= 20);

        //Print rectangle's parameters
        System.out.print("\nCalculating rectangle area and perimeter...\n");
        System.out.printf("Length: %8.2f feet%nWidth: %9.2f feet%nPerimeter: %5.2f feet%nArea: %10.2f square feet%n",
                          rectangle1.getLength(), rectangle1.getWidth(),
                          rectangle1.rectanglePerimeter(), rectangle1.rectangleArea());

        //Goodbye message
        System.out.println("\nThank you for using the Rectangle application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }
}