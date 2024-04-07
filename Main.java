import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {

        //Środek koła
        Point center = new Point(2.0, 2.0);

        //
        Circle circle = new Circle(center, 2.0);

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());

    
    }
    
}
