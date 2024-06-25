//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/29/2024 5:00 pm
//      Assignment Completion : 5/02/2024 1:42 am
// Total Hours for Assignment : 12 hours
//                   Comments : For this program, I would have liked to create methods for every class in order to
//                              validate if the input coordinate makes up the corresponding shape, if not, print a
//                              message letting the user know that the coordinates do not correspond to the respective
//                              shape.

import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class QuadrilateralTest {
    public static void main(String[] args) {
        //Initialize objects with their appropriate coordinates using their constructors
        Trapezoid trapezoid1 = new Trapezoid(new Point(0, 5), new Point(6, 5), new Point(1, 1), new Point(4, 1));
        Parallelogram parallelogram1 = new Parallelogram(new Point(3,4), new Point(6,4), new Point(1,1), new Point(4,1));
        Square square1 = new Square(new Point(1,4), new Point(4,4), new Point(1,1), new Point(4,1));
        Rectangle rectangle1 =  new Rectangle(new Point(1,5), new Point(4,5), new Point(1,1), new Point(4,1));


        //Print shapes' coordinates of their vertexes and output their areas using their toString()
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", "TRAPEZOID: ", trapezoid1.toString(), "PARALLELOGRAM: ",
                           parallelogram1.toString(), "SQUARE: ", square1.toString(), "RECTANGLE: ", rectangle1.toString());

        //Goodbye message
        System.out.println("\nThank you for using the Quadrilateral application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);

    }
}