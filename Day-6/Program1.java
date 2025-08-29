/* 
   1) Reverse a number
   We reverse a number by repeatedly taking the last digit (using %10) and building the reverse by multiplying the existing reverse by 10 and adding the digit.
   Sample Input: Input: 1234
   Sample Output: Output: 4321
*/

public class Program1{
    public static void main(String[] args){
        int num = 123;
        int digit;
        int reverse = 0;

        while (num > 0) {
            digit = num % 10;
            // System.out.println(digit);
            reverse = reverse * 10 + digit;
            // System.out.println(reverse);
            num = num / 10;
        }

        System.out.println(reverse);
    }
}