// 1. FizzBuzz Challenge 🐝
// Write a program that prints numbers from 1 to 100.
// For multiples of three, print "Fizz" instead of the number.
// For multiples of five, print "Buzz" instead of the number.
// For numbers which are multiples of both three and five, print "FizzBuzz".


public class program2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 != 0) {
                System.err.println("Fizz");
            }else if (i % 3 != 0 && i % 5 == 0){
                System.err.println("Buzz");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
