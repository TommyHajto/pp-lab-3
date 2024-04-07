public class Main {
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);
        double radius = 3.0;
        
        Circle circle = new Circle(center, radius);
        
        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}