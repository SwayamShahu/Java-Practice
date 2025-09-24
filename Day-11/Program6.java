// Drawable Interface: Define an interface Drawable with a single abstract method draw(). Then, create classes Circle, Rectangle, and Triangle that all implement the Drawable interface and provide a concrete draw() method that prints a message indicating it's drawing that shape.

interface Drawable {
    void draw();
}
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        Triangle obj3 = new Triangle();
        obj1.draw();
        obj2.draw();
        obj3.draw();
    }
}

