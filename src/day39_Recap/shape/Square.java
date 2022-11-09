package day39_Recap.shape;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if (side <= 0){
            System.err.println("Invalid side");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {// we do not need the instance " name" so we delete and write Square
        super("Square");
       // this.side = side; instead of this. method we use setSide method, because we need to make sure that the constructor assign the right data
        setSide(side);// because the setter also checks the requirement
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter

 */
