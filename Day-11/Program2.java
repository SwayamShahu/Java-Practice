// 2. Animal Sounds: Design an abstract class Animal with an abstract method makeSound() and a concrete method sleep(). The sleep() method can simply print "Zzz...". Create subclasses Dog and Cat that extend Animal and implement makeSound() to print "Woof" and "Meow" respectively.

abstract class Animal{
    abstract void makeSound();
    public void sleep(){
        System.out.println("Zzz...");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class Program2 {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj1.makeSound();
        obj1.sleep();
        obj2.makeSound();
        obj2.sleep();
    }

}
