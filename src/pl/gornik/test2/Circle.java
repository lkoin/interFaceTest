package pl.gornik.test2;

public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void shape() {
        System.out.println("My shape is round");
    }

    @Override
    public double calculateArea() {
        return radius * Math.PI;
    }
}
