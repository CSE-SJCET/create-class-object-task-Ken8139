public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alice";
        student.rollNumber = 101;
        student.grade = 'A';

        student.displayDetails();
    }
}
class Student {
    String name;
    int rollNumber;
    char grade;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
