class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(double length, double breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " Rectangle with length: " + length + " and breadth: " + breadth);
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}
