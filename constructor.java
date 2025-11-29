class Student {
    String name;
    int age;
    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
    // Parameterized constructor with one argument
    Student(String n) {
        name = n;
        age = 0;
    }
    // Parameterized constructor with two arguments
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();            // Calls default constructor
        Student s2 = new Student("Alex");      // Calls one-parameter constructor
        Student s3 = new Student("Sara", 22);  // Calls two-parameter constructor

        s1.display();
        s2.display();
        s3.display();
    }
}
