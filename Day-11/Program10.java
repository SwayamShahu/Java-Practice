// 10. Person Activity: Design an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the eat() and exercise() methods differently based on theirspecific behavior


abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    public void eat() {
        System.out.println("Athlete is eating a balanced diet.");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete is training hard.");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("LazyPerson is eating junk food.");
    }

    @Override
    void exercise() {
        System.out.println("LazyPerson is avoiding exercise.");
    }

    
}
public class Program10 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
