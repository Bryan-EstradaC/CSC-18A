//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/29/2024 5:00 pm
//      Assignment Completion : 5/02/2024 1:42 am
// Total Hours for Assignment : 12 hours


public class Quadrilateral {
    //Point objects
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    //Quadrilateral constructor that accepts four points objects as arguments
    public Quadrilateral(Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    //Quadrilateral constructor that accepts eight doubles to initialize coordinates
    public Quadrilateral(double xPoint1, double yPoint1, double xPoint2, double yPoint2,
                         double xPoint3, double yPoint3, double xPoint4, double yPoint4){
        this.point1 = new Point(xPoint1, yPoint1);
        this.point2 = new Point(xPoint2, yPoint2);
        this.point3 = new Point(xPoint3, yPoint3);
        this.point4 = new Point(xPoint4, yPoint4);
    }

    //Getters
    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }
    public Point getPoint4(){
        return point4;
    }

    //Override toString method from Object class
    @Override
    public String toString(){
        return String.format("%s%s%n%s%s%n%s%s%n%s%s", "Point 1: ", point1.toString(),
                             "Point 2: ", point2.toString(), "Point 3: ", point3.toString(), "Point 4: ", point4.toString());
    }
}