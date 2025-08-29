/* 
    10) Check Armstrong number
    An Armstrong number is equal to the sum of its digits raised 
    to the power of the number of digits.
    Example: 153 = 1³ + 5³ + 3³.
    Sample Input:  153
    Sample Output: Armstrong number
*/

public class Program10 {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;

        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        copy = num;
        while (copy > 0) {
            int digit = copy % 10;
            sum = sum + (int)Math.pow(digit, digits);
            copy = copy / 10;
        }

        if (num == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
