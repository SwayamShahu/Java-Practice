class Employee {
    protected double baseSalary;

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    private double performanceBonus;

    Developer(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

class Intern extends Employee {
    private double stipend;

    Intern(double stipend) {
        super(0); 
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}

public class Program4 {
    public static void printSalary(Employee emp) {
        System.out.println(emp.getClass().getSimpleName() + " salary = " + emp.calculateSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Manager(50000, 10000);
        Employee e2 = new Developer(40000, 5000);
        Employee e3 = new Intern(10000);

        printSalary(e1);
        printSalary(e2);
        printSalary(e3);
    }
}
