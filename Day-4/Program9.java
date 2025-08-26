/* 
8. Sum the Digits of a 3-Digit Number ➕
Given a three-digit integer, write a single expression that calculates the sum of its three digits. For example, if the number is 482, the result should be 4 + 8 + 2 = 14.
*/

public class Program9 {
    public static void main(String[] args) {
        int num = 482; 


        int sum = (num % 10) + ((num / 10) % 10) + (num / 100);

        System.out.println("The sum of the digits is: " + sum); 
    }
}
