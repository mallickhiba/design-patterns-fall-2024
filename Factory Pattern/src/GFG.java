public class GFG {
    public static void main(String[] args) {
        Client client = new Client(VehicleType.VT_TwoWheeler);
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}