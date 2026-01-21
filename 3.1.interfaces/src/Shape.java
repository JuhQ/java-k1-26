abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract double calculateArea();

    // Regular method
    public void displayColor() {
        System.out.println("Color: " + color);
    }

    public void sanoMoi() {
        System.out.println("Moi");
    }

}
