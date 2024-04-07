
import geometry.ColoredCircle;
import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(1.0, 2.0), 3.0);
        circles[1] = new ColoredCircle(new Point(3.0, 4.0), 5.0, "red");
        
        for (Circle circle : circles) {
            System.out.println("Area: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Color: " + coloredCircle.getColor());
            }
        }
    }
}