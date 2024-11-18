public class Main {
    public static void main(String[] args) {
        // Create Circle
        Shape circle = ShapeFactory.createShape("circle", "red", 5.0);
        if (circle != null) {
            circle.draw();
            System.out.println("Area of Circle: " + circle.calculateArea());
        }

        // Create Rectangle
        Shape rectangle = ShapeFactory.createShape("rectangle", "blue", 4.0, 6.0);
        if (rectangle != null) {
            rectangle.draw();
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        }

        // Create Triangle
        Shape triangle = ShapeFactory.createShape("triangle", "green", 5.0, 8.0);
        if (triangle != null) {
            triangle.draw();
            System.out.println("Area of Triangle: " + triangle.calculateArea());
        }

        // Trying to create an unknown shape
        Shape unknown = ShapeFactory.createShape("hexagon", "yellow", 5.0);
        if (unknown != null) {
            unknown.draw();
        }
    }
}
