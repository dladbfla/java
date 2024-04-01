package _0326.Example;

public class Triangle implements Shape{

    private double base;
    private double side;
    private double length;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double side, double length, double height) {
        this.base = base;
        this.side = side;
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height/2;
    }

    @Override
    public double calculatePerimeter() {
        return base + side + length;
    }
}
