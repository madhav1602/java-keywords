class Hospital {
    static String hospitalName = "Neelam Hospital";
    static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    final String patientID;

    // Constructor
    public Hospital(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void display() {
        if (this instanceof Hospital) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    public static void main(String[] args) {
        Hospital p1 = new Hospital("Madhav", 25, "Fever", "P001");
        Hospital p2 = new Hospital("Simran", 30, "Cold", "P002");

        p1.display();
        p2.display();

        System.out.println("Total Patients Admitted: " + Hospital.getTotalPatients());
    }
}
