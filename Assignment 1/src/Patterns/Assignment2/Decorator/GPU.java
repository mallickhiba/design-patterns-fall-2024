package Patterns.Assignment2.Decorator;
class GPU extends AddOnsDecorator{
    Laptop laptop;

    public GPU( Laptop laptop) {
        this.laptop = laptop;
    }

    public String getDescription() {
        return laptop.getDescription() + ", GPU";
    }

    public int getCost(){
        return laptop.getCost() + 40;
    }
}