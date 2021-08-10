package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
//    implements Measurable{}

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {// TODO This is the Constructor
        this.length = length;
        this.width = width;
    }

    //TODO abstract Accessors
    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);//    public void setLength(double length) {this.length = length;}

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);//    public void setWidth(double width) {this.width = width;}
}
