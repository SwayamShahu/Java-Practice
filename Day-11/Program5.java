// Musical Instruments: Create an abstract class Instrument with abstract methods play() and tune(). Implement subclasses Glockenspiel and Violin that extend Instrument and provide their own unique implementation for each method.

abstract class Instrument{
        abstract void play();
        abstract void tune();
    }
    class Glockenspiel extends Instrument{
        public void play(){
            System.out.println("Glockenspiel is playing");
        }
        public void tune(){
            System.out.println("Glockenspiel is tuning");
        }
    }
    class Violin extends Instrument{
        public void play(){
            System.out.println("Violin is playing");
        }
        public void tune(){
            System.out.println("Violin is tuning");
        }
    }
public class Program5 {
    public static void main(String[] args) {
        Glockenspiel obj1 = new Glockenspiel();
        obj1.play();
        obj1.tune();
        Violin obj2 = new Violin();
        obj2.play();
        obj2.tune();
    }
}
