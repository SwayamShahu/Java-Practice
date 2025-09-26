// ## Problem 2: Method Overriding (Animal Sounds)
// **Task** - Create an Animal class with a method makeSound() that prints "The animal makes a sound". - Create a Dog class that extends Animal and override the makeSound() method to print "The dog barks". - Create a Cat class that extends Animal and override the makeSound() method to print "The cat meows". **Example Output** ``` The animal makes a sound The dog barks The cat meows 


class animal{
    void makesound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends animal{
    void makesound(){
        System.out.println("The dog barks");
    }
}
class Cat extends animal{
    void makesound(){
        System.out.println("The cat meows");
    }
}
public class Program2 {
    public static void main(String[] args) {
        animal a=new animal();
        a.makesound();
        Dog d=new Dog();
        d.makesound();
        Cat c=new Cat();
        c.makesound();
    }
}
