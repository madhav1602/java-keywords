class Employee {
    static String companyName = "Capgemini";
    private static int totalEmployees = 0;
    private String name;
    private String designation;
    final int id;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Madhav", 101, "Software Engineer");
        Employee emp2 = new Employee("Simran", 102, "Analyst");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        displayTotalEmployees();
    }
}
