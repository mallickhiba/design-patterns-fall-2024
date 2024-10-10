class Client {
    private final Vehicle pVehicle; // Client doesn't explicitly create objects // but passes type to factory method
                                    // "Create()"

    Client(VehicleType type) {
        pVehicle = VehicleFactory.Create(type);
    }

    Vehicle getVehicle() {
        return pVehicle;
    }
}