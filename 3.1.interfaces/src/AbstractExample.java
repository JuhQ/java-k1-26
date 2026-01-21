public class AbstractExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 3.0);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        Square square = new Square("Blue", 4.0);
        square.displayColor();
        System.out.println("Square Area: " + square.calculateArea());

        square.sanoMoi();

        // abstract luokasta ei voi luoda instanssia
        // Shape shape = new Shape("väri");
    }
}
