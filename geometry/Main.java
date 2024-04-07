import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        // Tworzymy punkt, który będzie środkiem koła
        Point center = new Point(3.0, 4.0);

        // Tworzymy obiekt klasy Circle, zainicjuj go wartościami i wyświetl jego właściwości
        Circle circle = new Circle(center, 5.0);

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}