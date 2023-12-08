package pl.gornik.test2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(7);
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
