package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5, 4);

        Rectangle rectangle2 = new Rectangle(3.5, 2.5);

        System.out.println(rectangle1);//Rectangle{length=5.5, with=4.0, area=22.0, perimeter=19.0}
        System.out.println(rectangle2);//Rectangle{length=3.5, with=2.5, area=8.75, perimeter=12.0}

    }
}
