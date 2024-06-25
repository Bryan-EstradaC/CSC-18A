//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/29/2024 5:00 pm
//      Assignment Completion : 5/02/2024 1:42 am
// Total Hours for Assignment : 12 hours

public class Trapezoid extends Quadrilateral{
    private double height;  //Height of the trapezoid

    //Trapezoid constructor that accepts four points objects as arguments
    public Trapezoid(Point point1, Point point2, Point point3, Point point4){
        super(point1, point2, point3, point4);
        this.height = point1.getY() - point3.getY();
    }

    //Trapezoid constructor that accepts eight doubles to initialize coordinates
    public Trapezoid(double xPoint1, double yPoint1, double xPoint2, double yPoint2,
                     double xPoint3, double yPoint3, double xPoint4, double yPoint4){
        super(xPoint1, yPoint1, xPoint2, yPoint2, xPoint3, yPoint3, xPoint4, yPoint4);

        this.height = yPoint1 - yPoint3;
    }

    //Gettter for height
    public double getHeight(){
        return height;
    }

    //Calculate the sum of the top side and bottom side of the trapezoid
    public double getSumOfTwoSides(){
        return getPoint2().getX() - getPoint1().getX() + getPoint4().getX() - getPoint3().getX();
    }

    //Compute trapezoid area
    public double getArea(){
        return (getSumOfTwoSides()/2) * getHeight();
    }

    //Override toString method from superclass Quadrilateral
    @Override
    public String toString(){
        return String.format("%s%n%s%.2f%n", super.toString(), "Area: ", getArea());
    }
}