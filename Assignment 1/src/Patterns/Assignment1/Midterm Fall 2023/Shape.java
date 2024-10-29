abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method for drawing the shape
    abstract void draw();

    // Abstract method for calculating the area of the shape
    abstract double calculateArea();
}