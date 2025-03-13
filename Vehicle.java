class Vehicle {
    static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    final String registrationNumber;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Madhav", "Car", "HR26AB1234");
        Vehicle bike = new Vehicle("Simran", "Bike", "PB10CD5678");

        car.display();
        bike.display();

        // Updating registration fee
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);
    }
}
