package pl.gornik.test2;

public class Rectangle implements Shape {
    private double a;
    private double b;

    @Override
    public void shape() {
        System.out.println("My shape is Rectangle");
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }





}
