// ## Problem 3: Using the super Keyword (Employee Details)
// **Task** - Create a Person class with: - private instance variables for name (String) and age (int). - A constructor that accepts and initializes name and age. - A displayDetails() method that prints the person's name and age. - Create an Employee class that extends Person. - A private instance variable for employeeId (int). - A constructor that accepts name, age, and employeeId. It should use super() to pass the name and age to the Person constructor. - Override the displayDetails() method. This method should first call the super.displayDetails() method and then print the employee's ID. **Example Output** ``` Name: John Doe Age: 30 Employee ID: 12345 ```


class Person {
    private String name;
    private int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person {
    private int employeeId;
    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}
public class Program3 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 12345);
        emp.displayDetails();
    }
}
