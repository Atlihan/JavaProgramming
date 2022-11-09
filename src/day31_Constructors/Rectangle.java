package day31_Constructors;

public class Rectangle {

    public double length, with;

    public Rectangle(double length, double with) {
        this.length = length;
        this.with = with;
    }

    public double calcArea() {
        return length * with;
    }

    public double calcPerimeter() {
        return 2 * (length+with);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", with=" + with +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
