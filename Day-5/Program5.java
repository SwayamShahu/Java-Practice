/* 
   Q 5. The Ternary Operator Challenge
   Rewrite even/odd check using ternary operator.
   Original: if (number % 2 == 0) result="Even"; else result="Odd";
   Sample Input: number = 15 Sample Output: Odd
*/
public class Program5 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println((number % 2 == 0) ? "Even" : "Odd");
    }
}
