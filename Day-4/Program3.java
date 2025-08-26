/* 
2. Check for Leap Year 
Write a function that takes a year as input and returns true if it's a leap year, and false otherwise. A year is a leap year if it is divisible by 4, except for end-of-century years, which must be divisible by 400
*/

public class Program3 {
    public static void main(String[] args) {
        int year = 1900; // Try with 100, 1900, 2000, and 2024 to test!

        // The complete rule for a leap year in a single 'if' statement.
        // It's a leap year if:
        // (it's divisible by 4 AND not by 100) OR (it's divisible by 400)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is a Normal Year");
        }
    }
}