//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/29/2024 5:00 pm
//      Assignment Completion : 5/02/2024 1:42 am
// Total Hours for Assignment : 12 hours

public class Parallelogram extends Trapezoid{

    //Parallelogram constructor that accepts four points objects as arguments
    public Parallelogram(Point point1, Point point2, Point point3, Point point4){
        super(point1, point2, point3, point4);
    }

    //Parallelogram constructor that accepts eight doubles to initialize coordinates
    public Parallelogram(double xPoint1, double yPoint1, double xPoint2, double yPoint2,
                     double xPoint3, double yPoint3, double xPoint4, double yPoint4){
        super(xPoint1, yPoint1, xPoint2, yPoint2, xPoint3, yPoint3, xPoint4, yPoint4);
    }

    //Calculate Parallelogram width
    public double getWidth(){
        return getPoint2().getX() - getPoint1().getX();
    }

    //Calculate parallelogram area by overriding getArea method from superclass Trapezoid
    @Override
    public double getArea(){
        return getHeight() * getWidth();
    }

    //Override toString method from superclass Trapezoid
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
