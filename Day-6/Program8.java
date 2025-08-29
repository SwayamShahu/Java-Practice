/*
    8) Check whether a number is prime
    Prime number is divisible only by 1 and itself.
    We check divisibility from 2 to n/2. If divisible, not prime.
    Sample Input:  7
    Sample Output: Prime
*/

public class Program8 {
    public static void main(String[] args) {
        int num = 31;
        boolean flag = true;

        if (num <= 1) {
            flag = false;  // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;  // no need to check further
                }
            }
        }

        if (flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
