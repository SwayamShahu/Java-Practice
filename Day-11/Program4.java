// Vehicles: Design an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Implement subclasses Car and Motorcycle that extend Vehicle and provide a concrete implementation for each method


abstract class vehicles{
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends vehicles{
    public void startEngine(){
        System.out.println("Car engine started");
    }
    public void stopEngine(){
        System.out.println("Car engine stopped");
    }   
}
class Motorcycle extends vehicles{
    public void startEngine(){
        System.out.println("Motorcycle engine started");
    }
    public void stopEngine(){
        System.out.println("Motorcycle engine stopped");
    }
}
public class Program4 {
   public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.startEngine();
        obj1.stopEngine();

        Motorcycle obj2 = new Motorcycle();
        obj2.startEngine();
        obj2.stopEngine();
   } 
}
