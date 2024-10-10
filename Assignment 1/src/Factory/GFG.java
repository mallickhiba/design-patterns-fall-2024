public class GFG {
    public static void main(String[] args) {
        Client client = new Client(VehicleType.VT_TwoWheeler);
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();

        Client client2 = new Client(VehicleType.VT_FourWheeler);
        Vehicle vehicle2 = client2.getVehicle();
        vehicle2.printVehicle();
    }
}