public class ShapeFactory {
    public static Shape createShape(String shapeType, String color, double... dimensions) {
    try {
        switch (shapeType.toLowerCase()) {
            case "circle":
                if (dimensions.length != 1) {
                    }
                
                    public static void main(String[] args) {
                        // Example usage
                        Shape circle = createShape("circle", "red", 5.0);
                        Shape rectangle = createShape("rectangle", "blue", 4.0, 6.0);
                        Shape triangle = createShape("triangle", "green", 3.0, 4.0);
                
                        // Print shapes
                        System.out.println(circle);
                        System.out.println(rectangle);
                        System.out.println(triangle);
                    }
                }
                }
                return new Circle(dimensions[0], color);
            case "rectangle":
                if (dimensions.length != 2) {
                    throw new IllegalArgumentException("Rectangle requires exactly 2 dimensions (length, breadth).");
                }
                return new Rectangle(dimensions[0], dimensions[1], color);
            case "triangle":
                if (dimensions.length != 2) {
                    throw new IllegalArgumentException("Triangle requires exactly 2 dimensions (height, base).");
                }
                return new Triangle(dimensions[0], dimensions[1], color);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    } catch (IllegalArgumentException e) {
        System.err.println("Invalid arguments: " + e.getMessage());
        return null;
    } catch (Exception e) {
        System.err.println("Error creating shape: " + e.getMessage());
        return null;
    }
}
