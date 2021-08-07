package shapes;

public class Square extends Rectangle{

    protected int side;
    protected String areaMsg = "Area";// using to tell if I am using the override
    protected String areaPerimeter = "Perimeter";// using to tell if I am using the override

    public Square(int side){// our square constructor
        super(side,side);// calls the parent's constructor to set both length & width to value of side
        this.side = side;//
    }


    @Override
    public double getArea() {
//       double side = super.getWidth();// alt try super.getArea() bc its less specific
//        return 4 * side;
        System.out.println("NEW area calculations: ");
        return 4 * side; //works bc we created a new variable side to assign value to

    }

    @Override
    public double getPerimeter() {
//        double side = super.getPerimeter();
        System.out.println("NEW perimeter calculations: ");
        return side * side;
    }


}
