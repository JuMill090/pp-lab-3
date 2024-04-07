import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {

        //Środek koła
        Point center = new Point(2.0, 2.0);

        //Obiekt klasy
        Circle circle = new Circle(center, 2.0);

        //Obiekt klasy ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "red");

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());

    
    }
    
}
