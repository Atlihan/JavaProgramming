package day04_Variables;

public class Circle {
    public static void main(String[] args) {
/* Create a class named Circle, write a program that can calculate  the area & perimeter of any given Circle
PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area =
radius * radius * PI
Perimeter =
2 * radius * PI
 */
     double PI = 3.14;
     double radius = 10;
     double diameter = radius * 2;
     double area = PI * radius * radius;
     double perimeter = diameter * PI;

        System.out.println("perimeter = " + perimeter + " cm ");
        System.out.println("area = " + area + " cm ");
        System.out.println("radius = " + radius + " cm ");

    }
}
