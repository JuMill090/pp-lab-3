package geometry;

public class Circle {
    private Point center;
    private double radius;

    public Circle(point center, double radius) {
        this.center = center;
        this.radius = radius;
    }    
    
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}