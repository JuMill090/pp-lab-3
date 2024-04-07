public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Point, zainicjuj go wartościami i wyświetl jego współrzędne
        Point point = new Point(3.5, 2.0);
        
        System.out.println("Współrzędna x: " + point.getX());
        System.out.println("Współrzędna y: " + point.getY());
    }
}