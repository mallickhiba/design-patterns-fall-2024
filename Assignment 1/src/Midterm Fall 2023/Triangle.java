class Triangle extends Shape {
    double height, base;

    public Triangle(double height, double base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " Triangle with height: " + height + " and base: " + base);
    }

    @Override
    double calculateArea() {
        return (height * base) / 2;
    }
}