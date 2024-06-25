//            Programmer Name : Bryan Estrada
//           Assignment Start : 4/26/2024 6:00 pm
//      Assignment Completion : 4/27/2024 12:42 am
// Total Hours for Assignment : 6 hours
//                   Comments : The class has one non-arguments constructor to set the instance variables to 1.0 as
//                              default values. Also, the program is based on feet as units for the length and width to
//                              to make more realistic.

public class Rectangle {
    private float length;   //Rectangle length
    private float width;    //Rectangle width

    //Rectangle default constructor
    Rectangle(){
        length = 1.0f;  //this.length
        width = 1.0f;   //this.width
        System.out.printf("Default length: %.2f foot%nDefault width: %5.2f foot%n", length, width);
    }

    //Rectangle's length setter
    public void setLength(float length){
        if(length <= 0 || length >= 20) {
            //Throw an exception if length is invalid
            throw new IllegalArgumentException("Length must be larger than zero and less than twenty.");
        }
            this.length = length;   //If length argument is valid, then assign it to this.length
    }

    //Rectangle's width setter
    public void setWidth(float width){
        if(width <= 0 || width >= 20) {
            //Throw an exception if width is invalid
            throw new IllegalArgumentException("Width must be larger than zero and less than twenty.");
        }
        this.width = width; //If width argument is valid, then assign it to this.width
    }

    //Rectangle's length getter
    public float getLength(){
        return length;
    }

    //Rectangle's length getter
    public float getWidth(){
        return width;
    }

    //Calculate rectangle's area
    public float rectangleArea(){
        return length * width;
    }

    //Calculate rectangle's perimeter
    public float rectanglePerimeter(){
        return 2*(length + width);
    }
}