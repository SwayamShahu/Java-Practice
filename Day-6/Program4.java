/*
    4) Count number of even and odd digits
    Extract each digit using %10. If digit%2==0, it's even else odd. Count them separately.
    Sample Input: Input: 24681
    Sample Output: Output: Even digits = 3, Odd digits = 2
*/

public class Program4 {
    public static void main(String[] args) {
        int num = 123;
        int evenCount = 0;
        int oddCount = 0;
        if (num == 0) {
            System.out.println("Even Digits: 1");
            System.out.println("Odd Digits: 0");
        } else {
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                num = num / 10;
            }
            System.out.println("Even Digits: " + evenCount);
            System.out.println("Odd Digits: " + oddCount);
        }

    }
}
