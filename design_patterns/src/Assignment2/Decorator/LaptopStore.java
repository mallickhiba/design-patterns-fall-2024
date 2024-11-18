public class LaptopStore {
    
    public static void main(String[] args) {
        Laptop laptop = new Latitude();
        System.out.println(laptop.getDescription()+ " Cost: "+ laptop.getCost());

        Laptop laptop2 = new Inspiron();
        laptop2 = new GPU(laptop2);
        laptop2 = new RAM(laptop2);

        System.out.println(laptop2.getDescription()+ " Cost: "+ laptop2.getCost());


    }
}
