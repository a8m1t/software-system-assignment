
package lab1;

public class Driver {

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.toString());

        // Test Circle
        Circle circle = new Circle(7);
        System.out.println(circle.toString());

        // Test Ellipse
        Ellipse ellipse = new Ellipse(5, 3);
        System.out.println(ellipse.toString());

        // Additional ellipses
        Ellipse ellipse2 = new Ellipse(5, 2);
        System.out.println(ellipse2.toString());
    }
}
