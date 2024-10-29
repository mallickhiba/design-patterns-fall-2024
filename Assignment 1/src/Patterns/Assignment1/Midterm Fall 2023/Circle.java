class Circle extends Shape {
    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " Circle with radius: " + radius);
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}