// Create a basic inheritance structure with a Vehicle superclass and a Car subclass. **Task** - Create a Vehicle class with the following: - A protected string variable brand. - A method honk() that prints "Tuut, tuut!". - Create a Car class that extends Vehicle: - A private string variable modelName. - A constructor that sets the brand (from the Vehicle class) and the modelName. - A main method to create a Car object and call its honk() method and display its brand and model name. **Example Output** ``` Tuut, tuut! Brand: Ford, Model: Mustang


// Superclass Vehicle
class Vehicle {
    protected String brand; // protected variable

    // Method
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Subclass Car extends Vehicle
class Car extends Vehicle {
    private String modelName; // private variable

    // Constructor
    public Car(String brand, String modelName) {
        this.brand = brand;         // set inherited brand
        this.modelName = modelName; // set modelName
    }

    // Getter for modelName
    public String getModelName() {
        return modelName;
    }
}

public class Program1 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Ford", "Mustang");

        // Call the honk method
        myCar.honk();

        // Display brand and model name
        System.out.println("Brand: " + myCar.brand + ", Model: " + myCar.getModelName());
    }
}
