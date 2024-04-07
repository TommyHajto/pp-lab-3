
import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        
        System.out.println("Side length: " + square.getLength()); // Ponieważ kwadrat ma taką samą długość boku, można uzyskać długość boku z dowolnego boku lub wysokości
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}