class Vechicles{
    public void getSpeed(){
        System.out.println("Vechicles getSpeed() is called");
    }
}
class Car extends Vechicles{
    public void getSpeed(){
        System.out.println("Car getSpeed() is been called");
    }
}
class Bicycle extends Vechicles{
    public void getSpeed(){
        System.out.println("Bicycle getSpeed() is been called");
    }
}
class Motorcycle  extends Vechicles{
    public void getSpeed(){
        System.out.println("Motorcycle  getSpeed() is been called");
    }
}
public class Program2 {
    public static void main(String[] args) {
        Vechicles[] obj = new Vechicles[3];
        Vechicles obj1 = new Bicycle();
        Vechicles obj2 = new Car();
        Vechicles obj3 = new Motorcycle();
        obj[0] = obj1;
        obj[1] = obj2;
        obj[2] = obj3;

        for (int i = 0; i < obj.length; i++) {
            obj[i].getSpeed();
        }
    }
}
