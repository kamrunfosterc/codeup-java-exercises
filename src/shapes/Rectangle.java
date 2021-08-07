package shapes;

public class Rectangle {

    protected int length;
    protected int width;


    public Rectangle(int userLength, int userWidth) {
        //constructor that accepts 2 numbers for length and width
        this.length = userLength;// not sure if this works yet
        this.width = userWidth;// not sure if this works yet
    }
    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (2*width) + (2*length);
        return perimeter;
    }

    //accessors

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



}
