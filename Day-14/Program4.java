// Write a method to count the number of digits in an integer using Integer wrapper methods.
public class Program4 {

    public static int countDigits(int number) {
        String numStr = Integer.toString(Math.abs(number)); 
        return numStr.length();
    }

    public static void main(String[] args) {
        int num1 = 12345;
        int num2 = -9876;

        System.out.println("Number of digits in " + num1 + " = " + countDigits(num1));
        System.out.println("Number of digits in " + num2 + " = " + countDigits(num2));
    }
}

