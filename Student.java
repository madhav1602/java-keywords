class Student {
    static String universityName = "Chitkara University";
    private static int totalStudents = 0;
    private String name;
    private char grade;
    final int rollNumber;

    // Constructor
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void display() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student("Madhav", 101, 'A');
        Student stu2 = new Student("Simran", 102, 'B');

        stu1.display();
        stu2.display();

        displayTotalStudents();
    }
}
