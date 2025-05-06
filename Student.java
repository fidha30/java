class Student {
    private int studentId;
    private String name;
    private double marks;

    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + (isPassed() ? "Yes" : "No"));
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Fidha", 85);
        Student student2 = new Student(102, "ayisha", 35);
        Student student3 = new Student(103, "mary", 40);
        
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
