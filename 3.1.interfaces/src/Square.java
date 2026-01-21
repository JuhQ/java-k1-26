public class Square extends Shape {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }
}
