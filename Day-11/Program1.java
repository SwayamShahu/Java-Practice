//1. Shape Hierarchy: Create an abstract class Shape with an abstract method calculateArea() and a concrete method display(). The display() method should print a message like "This is a shape." Create two subclasses, Circle and Rectangle, that extend Shape and provide their own implementations for calculateArea(). The Circle class should have a radius property, and the Rectangle class should have length and width properties


abstract class Shape{
    abstract void calculateArea();
    void display(){
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    double length = 20;
    double width = 30;

    public void calculateArea(){
        System.out.println("Area: " + 20 * 30);
    }
}

class Circle extends Shape{
    double radius = 8;
    public void calculateArea(){
        System.out.println("Area: " + 3.14 * radius * radius);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.calculateArea();
        obj1.display();
        Circle obj2 = new Circle();
        obj2.calculateArea();
        obj2.display();
    }
}