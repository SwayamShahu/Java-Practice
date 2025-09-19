/*
Challenge 2: The Rectangle
This challenge focuses on methods that return a value.

Task: Create a Rectangle class to calculate its area and perimeter.

1. Class Name: Rectangle
2. Fields:
    - double width;
    - double height;
3. Methods:
    - getArea(): This method should return the area of the rectangle (width * height). The return type should be double.
    - getPerimeter(): This method should return the perimeter of the rectangle (2 * (width + height)). The return type should be double.
4. In your main method: Create a Rectangle object (e.g., with width 5.0 and height 8.0) and print out the results from calling the getArea() and getPerimeter() methods.
*/

class Rectangle{
        double width;
        double height;
        public double getArea(){
            return this.width * this.height;
        }
        public double getPerimeter(){
            return 2 * (this.width + this.height);
        }
    }
public class Program2 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.width = 5.0;
        obj.height = 8.0;
        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " + obj.getPerimeter());
    }
}
