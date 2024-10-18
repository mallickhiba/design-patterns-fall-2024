public class LaptopStore {

    public static void main(String[] args) {
        Laptop laptop = new Latitude();
        laptop = new SSD(laptop);
        System.out.println(laptop.getDescription() + " Cost: " + laptop.getCost());

        Laptop laptop2 = new Inspiron();
        laptop2 = new GPU(laptop2);
        laptop2 = new RAM(laptop2);
        Laptop laptop3 = new Probook();
        laptop3 = new GPU(laptop3);
        laptop3 = new SSD(laptop3);
        laptop3 = new RAM(laptop3);

        System.out.println(laptop3.getDescription() + " Cost: " + laptop3.getCost());

    }
}
