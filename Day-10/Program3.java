class Animals{
    public void makeSound(){
        System.out.println("No animal is mention!!!");
    }
}
class Cat extends Animals{
    public void makeSound(){
        System.out.println("Meow!!!");
    }
}
class Dog extends Animals{
    public void makeSound(){
        System.out.println("Woof!!!");
    }
}
class Bird extends Animals{
    public void makeSound(){
        System.out.println("Chirp");
    }
}
public class Program3 {
    public static void main(String[] args) {
        Animals obj1 = new Bird();
        obj1.makeSound();
        Animals obj2 = new Cat();
        obj2.makeSound();
        Animals obj3 = new Dog();
        obj3.makeSound();
    }
}
