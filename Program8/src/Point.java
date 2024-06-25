//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/29/2024 5:00 pm
//      Assignment Completion : 5/02/2024 1:42 am
// Total Hours for Assignment : 12 hours


public class Point {
    private double x;   //x-value
    private double y;   //y-value

    //Point constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //Override toString from Object class
    @Override
    public String toString(){
        return String.format("%s%.2f, %.2f%s", "(", x, y, ")");
    }
}