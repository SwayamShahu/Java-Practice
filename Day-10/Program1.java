// Question 1

class Shape{
    public void calculateArea(){
        System.out.println("Calling shape class calculateArea()");
    }
}
class Triangle extends Shape{
    public void calculateArea(){
        System.out.println("Triangle → (1/2) × base × heigh");
    }
}
class Circle extends Shape{
    public void calculateArea(){
        System.out.println("Circle → π × r²");
    }
}
class Rectangle extends Shape{
    public void calculateArea(){
        System.out.println(" length × width ");
    }
}

public class Program1{
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.calculateArea();
        Triangle obj2 = new Triangle();
        obj2.calculateArea();
        Circle obj3 = new Circle();
        obj3.calculateArea();
        Rectangle obj4 = new Rectangle();
        obj4.calculateArea();
    }
}