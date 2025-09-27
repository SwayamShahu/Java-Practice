/* 
2. Intermediate Level: The Car Class 🚗 Task: Design a class named Car that models a real-world car, controlling its state through methods. 
Data Members (Private): 
    - make (String) 
    - model (String) 
    - year (int) 
    - speed (int) 
Methods (Public): 
    - Constructor: A constructor that initializes make, model, and year. The speed must always be initialized to 0. 
    - getSpeed(): A method to return the current speed. 
    - accelerate(): A method that increases the speed by 5. 
    - brake(): A method that decreases the speed by 5. 
    - Constraint: The speed must never become negative. Ensure your brake() method handles this condition. There should be no public setSpeed() method; speed can only be changed via accelerate() and brake(). 
Goal: To understand how encapsulation controls an object's state by forcing interaction through defined behaviors rather than allowing direct modification of data members. 
*/

class Car{
    private String make;
    private String model;
    private int year;
    private int speed;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
    }
}



public class Program2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        System.out.println("Initial Speed: " + car.getSpeed() + " mph");

        car.accelerate();
        System.out.println("Speed after acceleration: " + car.getSpeed() + " mph");

        car.accelerate();
        System.out.println("Speed after another acceleration: " + car.getSpeed() + " mph");

        car.brake();
        System.out.println("Speed after braking: " + car.getSpeed() + " mph");

        car.brake();
        car.brake(); // Attempting to brake below 0
        System.out.println("Speed after multiple brakes: " + car.getSpeed() + " mph");
    }
}
