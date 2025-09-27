/* 
1. Beginner Level: The Student Class 🎓 Task: Create a class named Student that encapsulates student data. 
Data Members (Private): 
    - studentId (String or int) 
    - name (String) 
    - gpa (double or float) 
Methods (Public): 
    - Constructor: A constructor that initializes all the data members. 
    - Getters: Public getter methods for all data members (e.g., getStudentId(), getName(), getGpa()). 
    - Setter: A public setter method for gpa (setGpa()). This method must include validation to ensure the GPA value is between 0.0 and 4.0. If an invalid value is provided, the method should print an error message and not update the GPA. 
Goal: To practice the basics of creating private fields and providing controlled public access with simple 
validation logic.
*/

class Student{
    private int studentId;
    private String name;
    private double gpa;
    Student(int id, String name, double gpa){
        this.studentId = id;
        this.name = name;
        this.gpa = gpa;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int id){
        this.studentId = id;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 3.5);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("GPA: " + student.getGpa());

        student.setGpa(3.8);
        System.out.println("Updated GPA: " + student.getGpa());
    }
}