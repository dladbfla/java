package _0326.Example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        Triangle triangle = new Triangle(3,2,5,2);
        System.out.println("Area:" + triangle.calculateArea());
        System.out.println("perimeter:" + triangle.calculatePerimeter());
    }
}
