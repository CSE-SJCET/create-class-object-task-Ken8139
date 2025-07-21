public class Main {
    // Define the Student class inside the same file
    static class Student {
        String name;
        int rollNumber;
        char grade;

        // Method to display student details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Assign sample data
        student1.name = "Alice";
        student1.rollNumber = 101;
        student1.grade = 'A';

        // Call displayDetails() method
        student1.displayDetails();
    }
}

