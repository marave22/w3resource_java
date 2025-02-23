//4. Chaining Constructors
//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
// Implement a default constructor and a parameterized constructor that takes all three instance variables.
// Use constructor chaining to initialize the variables. Print the values of the variables.

package OOP.JavaConstructor;

public class Student {
    final int studentID;
    final String studentName;
    final String grade;

    public Student() {
        this(0, "Unknown", "Unknown");
    }
    public Student(int studentID, String studentName, String grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Student1 ID: " + student1.studentID);
        System.out.println("Student1 studentName: " + student1.studentName);
        System.out.println("Student1 grade: " + student1.grade);

        Student student2 = new Student(101, "Cullen", "A");
        System.out.println("Student2 ID: " + student2.studentID);
        System.out.println("Student2 studentName: " + student2.studentName);
        System.out.println("Student2 grade: " + student2.grade);
    }
}
