/*
    5) Find sum of digits
    Extract digits using %10 and keep adding to sum until number becomes 0.
    Sample Input: Input: 4321
    Sample Output: Output: Sum = 10
*/
public class Program5 {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum = " + sum);
    }
}
