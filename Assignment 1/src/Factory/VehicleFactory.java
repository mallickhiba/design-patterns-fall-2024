class VehicleFactory { // Factory method to create objects of different types. // Change is required
                       // only in this function to create a new object type
    public static Vehicle Create(VehicleType type) {
        if (VehicleType.VT_TwoWheeler.compareTo(type) == 0) {
            return new TwoWheeler();
        } else if (VehicleType.VT_ThreeWheeler.compareTo(type) == 0) {
            return new ThreeWheeler();
        } else if (VehicleType.VT_FourWheeler.compareTo(type) == 0) {
            return new FourWheeler();
        }
        return null;
    }
}