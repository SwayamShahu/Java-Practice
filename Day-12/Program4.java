// ## Problem 4: Polymorphism (Shapes)
// **Task** - Create a Shape class with a method calculateArea() that returns 0.0. - Create a Rectangle class that extends Shape with width and height properties, a constructor, and an overridden calculateArea() method. - Create a Circle class that extends Shape with radius property, a constructor, and an overridden calculateArea() method. **Main Method** - Create a Shape variable myShape. Assign a new Rectangle object to myShape and print its area. - Assign a new Circle object to myShape and print its area. This shows how the same variable (myShape) can hold different object types and how the correct calculateArea() method is called each time.


class Shape{
    public double calculateArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    public double calculateArea(){
        return this.width * this.height;
    }
}
class Circle extends Shape{
    double radius;

    Circle(double r){
        this.radius = r;
    }

    public double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }
}
public class Program4 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(5, 10);
        obj1.calculateArea();

        Circle obj2 = new Circle(5);
        obj2.calculateArea();
    }
}
