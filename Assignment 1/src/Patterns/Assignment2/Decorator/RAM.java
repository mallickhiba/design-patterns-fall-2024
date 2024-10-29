package Patterns.Assignment2.Decorator;
class RAM extends AddOnsDecorator {
    Laptop laptop;

    public RAM(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getDescription() {
        return laptop.getDescription() + ", RAM";
    }

    public int getCost() {
        return laptop.getCost() + 70;
    }
}