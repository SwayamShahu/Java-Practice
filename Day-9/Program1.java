/*
Challenge 1: This challenge focuses on void methods that change an object's state.

Task:
Create a LightSwitch class that can be turned on and off.

1. Class Name: LightSwitch
2. Field (Instance Variable): boolean isOn; (to track if the light is on or off)
3. Methods:
- turnOn(): A void method that sets isOn to true and prints a message like "The light is now ON."
- turnOff(): A void method that sets isOn to false and prints a message like "The light is now OFF."
- printStatus(): A void method that prints the current status, e.g., "Is the light on? true".
4. In your main method: Create a LightSwitch object, turn it on, print its status, turn it off, and print its status again
*/

class LightSwitch{
    boolean isOn;
    public void turnOn(){
        this.isOn = true;
        System.out.println("The light is now ON.");
    }
    public void turnOff(){
        this.isOn = false;
        System.out.println("The light is now OFF.");
    }
    public void printStatus(){
        System.out.println("The light is now " + isOn);
    }
}
public class Program1{
    public static void main(String[] args) {
        LightSwitch obj = new LightSwitch();
        obj.turnOn();
        obj.printStatus();
        obj.turnOff();
        obj.printStatus();
    }
}
