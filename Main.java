import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Rectangle, zainicjuj go wartościami i wyświetl jego właściwości
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        System.out.println("Długość prostokąta: " + rectangle.getLength());
        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}