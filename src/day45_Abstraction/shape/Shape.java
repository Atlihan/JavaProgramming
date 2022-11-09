package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;// to assign each child class name we can also use get method; getSimpleName returns us what class name is/
    }

    public String getName (){
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
