class SSD extends AddOnsDecorator {
    Laptop laptop;

    public SSD(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getDescription() {
        return laptop.getDescription() + ", SSD";
    }

    public int getCost() {
        return laptop.getCost() + 70;
    }
}