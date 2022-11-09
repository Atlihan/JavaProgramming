package day39_Recap.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);//Square{side=10.0, area='100.0', perimeter='40.0'}

        System.out.println("-----------------------------");

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);//Rectangle{length=5.0, width=6.0, area='30.0', perimeter='22.0'}

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);

        System.out.println("--------------------------");

        Circle circle = new Circle(5);
        System.out.println(circle);//Circle{radius=5.0, pi='3.14', area='78.5', perimeter='31.400000000000002'}

        circle.setRadius(-4);
        System.out.println(circle.getRadius());

        System.out.println(circle);//Invalid radius : -4.0

    }
}
