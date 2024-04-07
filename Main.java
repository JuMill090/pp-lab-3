import geometry.Square;

public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Square, zainicjuj go wartościami i wyświetl jego właściwości
        Square square = new Square(5.0);

        System.out.println("Długość boku kwadratu: " + square.getLength()); // Ta metoda została dziedziczona z klasy Rectangle
        System.out.println("Pole kwadratu: " + square.calculateArea()); // Ta metoda została dziedziczona z klasy Rectangle
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter()); // Ta metoda została dziedziczona z klasy Rectangle
    }
}
}